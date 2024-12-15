package MapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MainMethod {

    public static void main(String[] args) {
        List<Customer> list = CustomerDB.getAll();
        // Here, I have a list of Customer objects and want to convert it into a list of strings representing email addresses.
        // This is a data transformation process, so we use map() to transform each Customer into their email address.
        // Since each Customer has a single email address, using map results in a one-to-one mapping.
        List<String> listOfEmail = list.stream()
                                      .map(Customer::getEmail) // Extracts the email from each Customer object.
                                      .peek(x -> System.out.println(x)) // Prints each email to the console during the stream processing.
                                      .collect(Collectors.toList()); // Collects the transformed email addresses into a new List of strings.
        
        // Now, we try to fetch the customer's phone numbers using map() and see the issue with using map() directly.
        // Using map() here results in a stream of lists, meaning each element is a list of phone numbers.
        // The data remains in a nested structure (non-flat).
        List<List<String>> phone = list.stream()
            .map(customer -> customer.getPhoneNo()) // Returns a list of phone numbers for each customer.
            .peek(x -> System.out.println(x)) // Prints each list of phone numbers.
            .collect(Collectors.toList()); // Collects the list of phone numbers as a list of lists.
        System.out.println(phone);
       
        // To transform the nested structure into a single flat stream, we use flatMap().
        // flatMap() is used here to flatten the nested lists of phone numbers into a single stream.
        // This is suitable because each customer can have multiple phone numbers, so a one-to-many transformation is needed.
        List<String> flattenedPhoneList = list.stream()
            .flatMap(customer -> customer.getPhoneNo().stream()) // Converts each list of phone numbers into a stream and merges them.
            .distinct() // Removes duplicate phone numbers.
            .collect(Collectors.toList()); // Collects the unique phone numbers into a new List of strings.
        System.out.println(flattenedPhoneList);
    }
}
