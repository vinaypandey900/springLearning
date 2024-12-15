package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceStreamAPI {

    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate the sum using the sum() method
        // mapToInt converts the Integer stream to an IntStream for sum calculation
        int sum = list.stream()
                      .mapToInt(i -> i) // Convert Integer to int
                      .sum();           // Sum the elements
        System.out.println("With sum() method = " + sum);
        
        // Calculate the sum using the reduce() method
        // The reduce method takes a binary operator to combine the elements.
        // Here, we use a lambda expression (a, b) -> a + b to sum the values.
        // This version of reduce does not have an identity value, so it returns an Optional.
        Optional<Integer> sum2 = list.stream()
                                      .reduce((a, b) -> a + b); // Combine using reduce
        System.out.println("With reduce() binary operator method = " + sum2.get());
        
        // Calculate the product using reduce() with an identity value.
        // The identity value is 1, so if the list is empty, the result will be 1.
        // This version of reduce returns a non-Optional result directly.
        int mul = list.stream()
                      .reduce(1, (a, b) -> a * b); // Multiply elements
        System.out.println("Multiply result = " + mul);
        
        // Use reduce() with an identity value to concatenate strings.
        // The identity value is an empty string ("").
        // It will combine each element using the concatenation function.
        String str = Stream.of("Hello world", "hello printer")
                           .reduce("", (a, b) -> a.concat(b)); // Concatenate strings
        System.out.println("Concatenated string is: " + str);
        
        // Find the maximum value using reduce() with an identity value.
        // The identity is set to Integer.MIN_VALUE to ensure we handle negative values.
        // The lambda (a, b) -> a > b ? a : b compares and retains the maximum value.
        int max = Stream.of(-1, -222, 1, 3, 2, 6, 9, 2)
                        .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b); // Find max value
        System.out.println("Max value is = " + max);
    }
}
