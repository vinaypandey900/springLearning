package functionalInterface;

import java.util.function.Function;

public class IdentityInFunction {
	public static void main(String []args) {
		Function<Integer, Integer>identityFunction=Function.identity();
		System.out.println(identityFunction.apply(1));
	}
}
