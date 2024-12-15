package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

//demonstrate about ZonedDateTime
public class CheckZonedDateTime {

	public static void main(String[] args) {
		
		//Current Zone of time and Date with zone name
		ZonedDateTime dateTime=ZonedDateTime.now();
		System.out.println("current Zoned time and Date: "+dateTime);
		
		//Current Zone name
		System.out.println(dateTime.getZone());
		
		//All Zone name
		ZoneId.getAvailableZoneIds().forEach(x->System.out.println(x));
		
		//create Custom Zone with ZoneId
		LocalDate date=LocalDate.of(2023, 1, 20);
		LocalTime localTime=LocalTime.of(12, 10);
		LocalDateTime dateTime2=LocalDateTime.of(date, localTime);
		ZoneId id=ZoneId.of("America/Cuiaba");
		ZonedDateTime customZonedDateTime=ZonedDateTime.of(dateTime2,id );
		System.out.println(customZonedDateTime);
		
	}
}
