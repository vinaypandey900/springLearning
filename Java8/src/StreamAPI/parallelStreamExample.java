package StreamAPI;

import java.util.stream.IntStream;

// This class demonstrates the performance difference between sequential and parallel streams in Java.
public class parallelStreamExample {

    public static void main(String[] args) {
        
        long start = 0;
        long end = 0;
        
        // Sequential Stream: This part measures the time taken to process a normal (sequential) stream.
        start = System.currentTimeMillis(); // Capture start time
        IntStream.range(1, 100) // Generate a stream of integers from 1 to 99
                 .forEach(x -> System.out.print(x + " ")); // Print each number
        end = System.currentTimeMillis(); // Capture end time
        
        System.out.println(); // New line for better readability
        System.out.println("Sequential stream time: " + (end - start) + " ms"); // Display execution time
        
        System.out.println("=================================");
        
        // Parallel Stream: This part measures the time taken to process a parallel stream.
        start = System.currentTimeMillis(); // Capture start time
        IntStream.range(1, 100) // Generate a stream of integers from 1 to 99
                 .parallel() // Enable parallel processing
                 .forEach(x -> System.out.print(x + " ")); // Print each number
        end = System.currentTimeMillis(); // Capture end time
        
        System.out.println(); // New line for better readability
        System.out.println("Parallel stream time: " + (end - start) + " ms"); // Display execution time
        
        // Note: The output timing may vary based on the system's CPU and load. 
        // Parallel stream may not always be faster for small data sets due to overhead.
    }
    // The output demonstrates the time taken for each stream type, showing that parallel streams can be faster for larger data sets.
}
