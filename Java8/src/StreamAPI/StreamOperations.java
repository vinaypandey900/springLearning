package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Learning about Stream operations in Java
public class StreamOperations {

    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 2, 3, 44, 5, 66, 8, 0);
        
        // We want to filter out all even elements from this list.
        // First, convert the list into a stream using 'stream()'.
        // Use the 'filter' method with a Predicate to define a condition:
        // Here, 'x -> x % 2 == 0' selects elements that are divisible by 2 (even numbers).
        // Finally, collect the filtered elements back into a list using 'collect()'.
        // 'collect()' is a terminal operation that gathers the results into a List.
        List<Integer> filterList = list.stream()
            .filter(x -> x % 2 == 0)  // Predicate to filter even numbers
            .collect(Collectors.toList());  // Collects the filtered result into a new list
        
        System.out.println(filterList);  // Outputs the filtered list
        
        
        // Now, let's learn about 'map'. We'll take elements from 'filterList'
        // and divide each of them by 2.
        // 'map' is an intermediate operation that applies a Function<T, R>, transforming each element.
        // It processes each element and produces a transformed output.
        List<Integer> mappedList = filterList.stream()
                  .map(n -> n / 2)  // Function to divide each element by 2
                  .collect(Collectors.toList());  // Collects the transformed result into a list
        
        System.out.println(mappedList);  // Outputs the transformed list
        
        // Now, we can chain multiple stream operations together for concise code.
        List<Integer> newList = list.stream()
        		                 .filter(n -> n % 2 == 0)  // Filter even numbers
        		                 .map(n -> n / 2)  // Divide each even number by 2
        		                 .collect(Collectors.toList());  // Collect the result into a list
        System.out.println(newList);  // Outputs the processed list
        
        // Here, I changed the list values and added more values with repetition
        // so we can use the 'distinct()' method to remove duplicates.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 2, 5, 66, 77, 99);
        List<Integer> distinctList = list1.stream()
                    .filter(n -> n % 2 == 0)  // Filter even numbers
                    .map(n -> n / 2)  // Divide each even number by 2
                    .distinct()  // Removes duplicate elements
                    .collect(Collectors.toList());
        System.out.println(distinctList);  // Outputs the list with distinct elements
        
        // Use the 'sorted()' method to sort all the elements.
        // The 'sorted()' method uses a Comparator to sort the elements.
        // By default, it sorts elements in ascending order.
        // For ascending order, the default behavior is equivalent to 'sorted((a, b) -> a - b)'.
        // For descending order, we use 'sorted((a, b) -> b - a)'.
        List<Integer> sortedElement = list1.stream()
                .filter(n -> n % 2 == 0)  // Filter even numbers
                .map(n -> n / 2)  // Divide each even number by 2
                .distinct()  // Removes duplicate elements
                .sorted((a, b) -> b - a)  // Sorts elements in descending order
                .collect(Collectors.toList());
        System.out.println(sortedElement);  // Outputs the sorted list in descending order
        
        
        // 'limit' is used to restrict the number of elements in the stream.
        // For example, limit(3) returns the first three elements from the stream.
        // If I want to show 3 elements out of a list of 4, I would use limit(3).
        // 'skip' is used to skip a specified number of elements from the start.
        // For example, if arr = {1, 2, 3, 4} and I want to skip the 1st element,
        // then skip(1) will ignore the first element and include the rest.
        System.out.println("------------------");
        List<Integer> listArray = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> printTheList = listArray.stream()
                                              .limit(3)  // Limits the stream to the first 3 elements: [1, 2, 3]
                                              .skip(2)   // Skips the first 2 elements of the limited list, resulting in [3]
                                              .collect(Collectors.toList());
        System.out.println(printTheList);  // Outputs: [3]
        
        // 'peek' is a consumer, which means it accepts elements and returns nothing.
        // It is mainly used for debugging purposes, such as printing elements during stream processing.
        // 'peek' can be used anywhere in the stream pipeline, but it requires a terminal operation to trigger execution.
        List<Integer> l = Stream.iterate(0, i -> i + 1)
                                .limit(101)  // Limits the stream to the first 101 elements (0 to 100)
                                .skip(0)     // Skips 0 elements (has no effect here)
                                .peek(i -> System.out.println(i))  // Prints each element as it's processed
                                .collect(Collectors.toList());  // Terminal operation to collect elements into a list
                 
    }
}
