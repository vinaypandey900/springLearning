package com.example.securityMainClass.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  
@EnableWebSecurity  
public class SecurityConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.csrf(csrf->csrf.disable())
		            .authorizeHttpRequests(request->{
		            	request.requestMatchers(HttpMethod.GET).permitAll();
		            	request.anyRequest().authenticated();
		            }).httpBasic(Customizer.withDefaults());
		return httpSecurity.build();
	}
}
