package functionalInterface;

import java.util.function.Function;

//with lambda expression
public class FunctionInterface{
	public static void main(String [] args) {
		//Here i am not using any String.valueOf() method
		//to convert int to String
		//When you use the + operator between
		//"Number in String:" (a String) and t (an Integer),
		//Java automatically calls the toString() method on the Integer t.
		Function<Integer, String>intToString=(t)-> "Number in String:"+ t;
		String s=intToString.apply(1);
		System.out.println(s);
	}
}
