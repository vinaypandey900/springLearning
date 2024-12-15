package loop;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Custom Consumer implementation that defines the behavior for each list element.
class forEachIter implements Consumer<String> {
    // The accept method gets called for each element in the list.
    @Override
    public void accept(String t) {
        System.out.println(t);
    }
}
public class forEachExample {
    public static void main(String[] args) {
        // Create an instance of forEachIter, which implements Consumer.
        Consumer<String> consumer = new forEachIter();
        
        // Create a list of strings.
        List<String> list = Arrays.asList("Vinay", "Maya", "Sunita");
        
        // The forEach method iterates over each element in the list
        // and applies the Consumer's accept method to each element.
        // In this case, it calls the accept method of forEachIter class,
        // which prints each element.
        list.forEach(consumer);
    }
}
