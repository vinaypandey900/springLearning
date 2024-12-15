package DateAndTimeAPI;

import java.time.LocalTime;

public class checkLocalTime {

	//Demonstrate about LocalTime
	public static void main(String[] args) {
		
		//check Current time using LocalTime()
		LocalTime localTime=LocalTime.now();
		System.out.println("Current Date of the System: "+localTime);
		
		//get hours from the LocalTime
		System.out.println("Hours from the LocalTime: "+ localTime.getHour());
		
		//create Custom LocalTime
		LocalTime customLocalTime=LocalTime.of(10, 20, 39, 9999);
		System.out.println(customLocalTime);
	}
}
