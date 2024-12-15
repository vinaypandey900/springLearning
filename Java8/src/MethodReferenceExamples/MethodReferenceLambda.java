package MethodReferenceExamples;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceLambda {
	 void test(String s) {
		System.out.println("This is "+s);
	}
	public static void main(String[] args) {
		MethodReferenceLambda x=new MethodReferenceLambda();
		List<String>list=Arrays.asList("Ajay","Sanjay","Digvijay","Ranjan");
		
		//if method test() is not static then we create object of class 
		//and put object in place of class name
		list.forEach(x::test);
		
		//now method is not static so we have to use instance
		list.forEach(s->x.test(s));
	}
}
