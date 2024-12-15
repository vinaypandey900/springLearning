package functionalInterface;

import java.util.function.Consumer;

public class andThenConsumer {
	public static void main(String[] args) {
		Consumer<String>input1=t->System.out.print(t);
		Consumer<String>input2=t->System.out.print(" Vinay, "+t);
		input1.andThen(input2).accept("Hello");;
	}
}
