package StreamAPI;

import java.util.stream.Stream;

public class CountStream {

	public static void main(String[] args) {
		//count number of elements in the stream
		long count=Stream.of(1,2,3,4,5)
		      .count();
		System.out.println("Total elements are: "+count);
		
		//count length of the all the string
		long len=Stream.of("Vinay","ajay","sanjay")
		      .count();
		System.out.println("The length of string is: "+len);
	}
}
