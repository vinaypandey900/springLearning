package StreamAPI;

import java.util.Arrays;
import java.util.List;

// Demonstrates the need for using Stream API in Java
public class WhyStream {

    public static void main(String[] args) {
        // Imperative approach to sum numbers in an array
        // This approach uses a loop to iterate over each element and sum them up.
        int[] arr = {1, 2, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum using imperative approach: " + sum);
        
        // Declarative or Stream approach to achieve the same result.
        // This approach is less verbose and more readable compared to the imperative approach.
        
        // Create a list of integers
        List<Integer> list = Arrays.asList(1, 2, 4, 5);
        
        // In this approach, we first convert the list into a stream.
        // Using mapToInt() converts the Stream<Integer> into an IntStream.
        // mapToInt() is necessary because it allows us to transform each Integer into a primitive int.
        // This makes summing more efficient, as IntStream provides a sum() method directly.
        int sum1 = list.stream()
                       .mapToInt(n -> n) // Converts each Integer to a primitive int.
                       .sum(); // Sums up all the int values in the IntStream.
        
        System.out.println("Sum using stream approach: " + sum1);
    }
}
