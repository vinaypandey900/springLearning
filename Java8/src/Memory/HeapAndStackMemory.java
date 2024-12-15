package Memory;

import java.lang.ref.WeakReference;

public class HeapAndStackMemory {

    public static void main(String[] args) {
        // Primitive data type stored directly in Stack memory
        int add = 10;
        
        // String literal is stored in the String Pool (part of the Heap),
        // and the reference is stored in the Stack
        String stringLiteral = "24";
        
        // Object is stored in the Heap, and the reference is stored in the Stack
        Person personObj = new Person();
        
        // Object is stored in the Heap, and the reference is stored in the Stack
        HeapAndStackMemory andStackMemory = new HeapAndStackMemory();
        
        // Method call: passing the reference of personObj (stored in Stack)
        andStackMemory.callNewMethod(personObj);    
    }

    private void callNewMethod(Person personObj) {
        // The reference to personObj2 points to the same object in the Heap as personObj,
        // no new memory is allocated in the Heap; both references are in the Stack
        Person personObj2 = personObj;
        
        // String literal "24" is checked in the String Pool;
        // if it exists, the same reference is used (no new object created in Heap)
        String literals2 = "24";
        
        // A new String object is created in the Heap, even if "24" already exists
        // in the String Pool. The reference is stored in the Stack.
        String newString = new String("24");
        
        
       
    }
}
