package StreamAPI;

import java.util.stream.IntStream;

// In this example, we demonstrate how a parallel stream is executed across multiple cores of the processor.
public class MultipleCoreInParallelStream {

    // Here, we are printing the thread name to observe which threads (cores) are used by the sequential and parallel streams.
    public static void main(String[] args) {
        
        // Sequential Stream (Normal Stream): Runs on the main thread only.
        System.out.println("For normal stream");
        IntStream.range(1, 10) // Generate a range of integers from 1 to 9
                 .forEach(x -> System.out.println("Thread name is: " + Thread.currentThread().getName()));
        
        System.out.println("==========================================");
        
        // Parallel Stream: Runs on multiple threads, potentially across different processor cores.
        System.out.println("For Parallel stream");
        IntStream.range(1, 10) // Generate a range of integers from 1 to 9
                 .parallel() // Enable parallel execution
                 .forEach(x -> System.out.println("Thread name is: " + Thread.currentThread().getName()));
    }
}
