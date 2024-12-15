package functionalInterface;

import java.util.function.Function;

//without lambda function
class manipulateStringFunction implements Function<String, String>{
	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
}
public class ManipulateString {
    public static void main(String[] args) {
    	Function<String, String> str=new manipulateStringFunction();
    	String s=str.apply("vinay");
    	System.out.println(s);
    }
}
