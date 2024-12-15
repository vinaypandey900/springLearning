package StreamAPI;

import java.util.Arrays;
import java.util.List;

//Using toArray() Without Parameters
public class toArrayStream {

	//Convert a list of strings into an array.
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4);
		Object[]array= list.stream()
		    .toArray();
		
		//Here, toArray() converts the stream into an Object[], 
		//so we use an Object array to store and print the elements.
		for(Object o:array) {
			System.out.println(o);
		}
		
	}
}
