package functionalInterface;

import java.util.function.Consumer;

//With Lambda Expression
public class ConsumerInterface {
	public static void main(String[] args) {
		Consumer<String>input=t->System.out.println("t");
		input.accept("Vinay");
	}
}
