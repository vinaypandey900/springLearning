package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

// Demonstrates usage of LocalDateTime class
public class checkLocalDateTime {

    public static void main(String[] args) {
        
        // Get the current system date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current system date and time: " + dateTime);
        
        // Create a custom date and time using LocalDate and LocalTime
        LocalDate customLocalDate = LocalDate.of(2024, 10, 1);
        LocalTime customLocalTime = LocalTime.of(12, 10);
        LocalDateTime customDateTime = LocalDateTime.of(customLocalDate, customLocalTime);
        System.out.println("Custom local date and time: " + customDateTime);
        
        // Check if the custom date and time is after the current date and time
        boolean isAfter = customDateTime.isAfter(dateTime);
        System.out.println("Is the custom date after the current date: " + isAfter);
        
        // Use TemporalField (ChronoField) to get specific fields from customDateTime
        // Retrieve and print the month of the year and hour of the day
        int month = customDateTime.get(ChronoField.MONTH_OF_YEAR);
        int hour = customDateTime.get(ChronoField.HOUR_OF_DAY);
        
        System.out.println("Month of custom date: " + month); // 10 for October
        System.out.println("Hour of custom time: " + hour);   // 12 (for 12 PM)
    }
}
