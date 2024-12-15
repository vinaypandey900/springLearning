package Interface;

//Define an interface named 'parent'
interface parent {
 // Default method A with an implementation
 default void A() {
     System.out.println("Hello A"); // Prints a message when called
 }
}

//Class 'child' implements the 'parent' interface
class child implements parent {
 // No additional methods or fields are defined here, so it inherits the default method A() from 'parent'
}

//Main class to demonstrate default methods in interfaces
public class defaultMethodInIntrfc {
 public static void main(String[] args) {
     // Create an instance of 'child'
     child c = new child(); // 'child' is a concrete class, so it can be instantiated
     c.A(); // Calls the default method A from the parent interface
     // Output: Hello A

     // The following line will cause a compilation error because interfaces cannot be instantiated directly:
     // child c1 = new parent(); // Not accessible
     // Reason: 'parent' is an interface, and interfaces cannot be instantiated directly in Java.

     // The following line will also cause a compilation error:
     // parent p = new parent(); // Not accessible
     // Reason: 'parent' is an interface, so it cannot be instantiated.

     // Create a 'parent' reference that points to a 'child' object
     parent p1 = new child(); // This is allowed due to polymorphism
     p1.A(); // Calls the inherited default method A from the parent interface through the 'child' instance
     // Output: Hello A
 }
}

