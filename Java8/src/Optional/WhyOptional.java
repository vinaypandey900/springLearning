package Optional;

import java.util.Optional;

public class WhyOptional {
    public static void main(String[] args) {
        Optional<String> s = test(1);
        //Here, we not using get() method to fetch the output from
        //the optional container as lambda is fetching the name 
        //present inside the container
        s.ifPresent(x->System.out.println(x));
        
        //or we can use Method Reference
        s.ifPresent(System.out::println);
    }
    public static Optional<String> test(int id) {
        // Fetch the name from the database based on the ID.
        String name = "Vinay";
        // Wrap the name inside an Optional object.
        return Optional.of(name);
    }
}
