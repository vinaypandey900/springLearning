package Interface;

interface A {
    default void child() {
        System.out.println("Child method from interface A");
    }
}

interface B {
    default void child() {
        System.out.println("Child method from interface B");
    }
}

public class defaultInterfaceInterview implements A, B {
    @Override
    public void child() {
        System.out.println("Child method from defaultInterfaceInterview class");
    }

    public static void main(String[] args) {
        defaultInterfaceInterview d = new defaultInterfaceInterview();
        d.child();  // Output will be "Child method from defaultInterfaceInterview class"
    }
}
