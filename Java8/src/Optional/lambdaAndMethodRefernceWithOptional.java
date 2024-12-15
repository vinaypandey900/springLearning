package Optional;

import java.util.Optional;

// This class demonstrates the use of Optional to handle potential null values safely.
// It shows how to perform operations within the Optional container using the map method 
// and how to handle the case when no value is present using orElseGet.
public class lambdaAndMethodRefernceWithOptional {
    
    public static void main(String[] args) {
        Optional<String> optional = test(1);
        
        // Use map to convert the value to uppercase if present
        Optional<String> optional1 = optional.map(String::toUpperCase);
        
        // Use orElseGet to provide a default value if no value is present
        String result = optional1.orElseGet(() -> "No such element present");
        System.out.println(result); // Prints the uppercase name or a default message if not present
    }

    public static Optional<String> test(int id) {
        // Simulate fetching data from the database based on the ID.
        String name = "Vinay"; // Change this to null to test the no-value scenario
        return Optional.ofNullable(name); // Wrap the name inside an Optional object
    }
}
