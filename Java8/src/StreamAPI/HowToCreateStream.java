package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Learn how to create streams; there are multiple ways to create streams.
public class HowToCreateStream {

    public static void main(String[] args) {
        
        // Create a stream from a list
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> streamList = list.stream();
        streamList.forEach(n -> System.out.println(n));  // Print each element in the stream
        
        // Create a stream from an array
        int[] arr = {1, 2, 3, 4};
        Arrays.stream(arr).forEach(n -> System.out.println(n));  // Print each element in the array
        
        // Create a stream directly using Stream.of, passing the values directly
        Stream<Integer> streamFromOwn = Stream.of(1, 2, 3, 4);
        streamFromOwn.forEach(n -> System.out.println(n));  // Print each element in the stream
        
        // Create a stream using the iterate method.
        // The iterate method is a UnaryOperator, which means it takes a value and returns a value of the same type.
        // '0' is the seed (starting value), and 'x -> x + 1' defines how to generate the next element.
        // The limit(10) ensures we only take 10 elements.
        Stream.iterate(0, x -> x + 1).limit(10)
                                     .forEach(n -> System.out.println(n));
        
        // Create a stream using the generate method, which uses a Supplier.
        // A Supplier provides values without taking any input (it "supplies" output).
        // Here, the generate method repeatedly outputs "Hello World!" and limit(3) takes only 3 values.
        Stream.generate(() -> "Hello World!").limit(3)
                                              .forEach(n -> System.out.println(n));
    }
}
