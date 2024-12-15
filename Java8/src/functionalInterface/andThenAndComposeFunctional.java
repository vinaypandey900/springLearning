package functionalInterface;

import java.util.function.Function;

public class andThenAndComposeFunctional {
	public static void main(String []args) {
		Function<Integer, Integer>fun1= f->f*2;
		Function<Integer, Integer>fun2= f->f+2;
		//first its execute fun1 and then fun2
		System.out.println(fun2.compose(fun1).apply(5));
	}
}
