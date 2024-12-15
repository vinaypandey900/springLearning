package com.example.airlineROS.service;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.airlineROS.dao.WeatherDao;
import com.example.airlineROS.entity.Weather;
import com.example.airlineROS.entity.WeatherApiResponse;

@Service
public class WeatherServiceImpl implements WeatherService{

	@Autowired
    private WeatherDao weatherRepository;

    @Value("${openweathermap.api.key}")
    private String apiKey;
    
    @Value("${weather.cities}")
    private String[] cities;



    @Override
    public void fetchAndSaveWeatherData(String city) {
        String url = String.format("https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s", city, apiKey);
        RestTemplate restTemplate = new RestTemplate();
        WeatherApiResponse response = restTemplate.getForObject(url, WeatherApiResponse.class);

        if (response != null) {
        	LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(response.getDt()), ZoneId.systemDefault());

            Weather existingWeather = weatherRepository.findByCity(city);

            if (existingWeather != null) {
                // Update existing record
                existingWeather.setWeatherCond(response.getWeather().get(0).getDescription());
                existingWeather.setTemp(response.getMain().getTemp() - 273.15); // Convert from Kelvin to Celsius
                existingWeather.setHumdity(response.getMain().getHumidity());
                existingWeather.setWindSpeed(response.getWind().getSpeed());
                existingWeather.setDate(dateTime);
                weatherRepository.save(existingWeather);
            } else {
                // Insert new record
                Weather weather = new Weather();
                weather.setWeatherCond(response.getWeather().get(0).getDescription());
                weather.setTemp(response.getMain().getTemp() - 273.15); // Convert from Kelvin to Celsius
                weather.setHumdity(response.getMain().getHumidity());
                weather.setWindSpeed(response.getWind().getSpeed());
                weather.setCity(city);
                weather.setDate(dateTime);
                weatherRepository.save(weather);
            }
        }
    }
    @Scheduled(fixedRate = 360000)
    public void fetchAndSaveWeatherDataForAllCities() {
        for (String city : cities) {
            fetchAndSaveWeatherData(city);
        }
    }
}
