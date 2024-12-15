package StreamAPI;

import java.util.Arrays;
import java.util.List;

//Using toArray() with a Generator Function
public class toArrayWithGenerator {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		
		//To get an array of a specific type, like String[] or 
		//Integer[], you can pass a generator function to toArray().
		//This function helps specify the array type and size.
		Integer[] array=list.stream()
		    .toArray(Integer []::new);
		for(Integer s:array) {
			System.out.println(s);
		}
		    
	}
}
