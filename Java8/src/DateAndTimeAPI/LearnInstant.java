package DateAndTimeAPI;

import java.time.Instant;

public class LearnInstant {

	public static void main(String[] args) {
		//In the past, Java used System.currentTimeMillis() to measure the current time.
		//This method returns the number of milliseconds since January 1, 1970 (Epoch), 
		//commonly known as the Unix Epoch.
		long currentTimeMills=System.currentTimeMillis();
		System.out.println(currentTimeMills);
		
		//others methods are apply here
		Instant now=Instant.now();
		System.out.println(now);
	}
	 
	
}
