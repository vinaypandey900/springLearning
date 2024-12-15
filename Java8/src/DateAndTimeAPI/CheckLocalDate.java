package DateAndTimeAPI;

import java.time.LocalDate;

// Demonstrates various operations with LocalDate in the Java Date and Time API
public class CheckLocalDate {

    public static void main(String[] args) {
        // Get the current date
        LocalDate dateNow = LocalDate.now();
        System.out.println("Current Date: " + dateNow);
        
        // Get the day of the month from the current date
        System.out.println("Day of Month: " + dateNow.getDayOfMonth());
        
        // Subtract 1 month from the current date
        System.out.println("Date 1 Month Ago: " + dateNow.minusMonths(1));
        
        // Create a custom LocalDate instance with a specific date
        LocalDate customDate = LocalDate.of(2024, 10, 12);
        System.out.println("Custom Date: " + customDate);
        
        // Add days to a LocalDate
        LocalDate plusDay = customDate.plusDays(1);
        System.out.println("Date after adding 1 day to Custom Date: " + plusDay);
        
        // Check if the custom date is before the current date
        boolean isBefore = customDate.isBefore(dateNow);
        System.out.println("Is the custom date before the current date? " + isBefore);
        
        // Parse a date from a string in the format "yyyy-MM-dd"
        String stringDate = "2024-10-20";
        LocalDate parsedDate = LocalDate.parse(stringDate);
        System.out.println("Parsed Date: " + parsedDate);
        
        // Check if the year of the custom date is a leap year
        boolean checkLeapYear = customDate.isLeapYear();
        System.out.println("Is the year of the custom date a leap year? " + checkLeapYear);
    }
}
