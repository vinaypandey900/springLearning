package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//learn all stream terminal operation
public class TerminalOperations {

	public static void main(String[] args) {
		
		
		//1.forEach() method is consumer 
		//where Consumer is a functional interface
		List<String>list=Arrays.asList("vinay","sanjay","ajay","patel");
		
		//without stream
		list.forEach(x->System.out.print(x+" "));
		
		//using stream
		//When used with streams, forEach is part of the Stream API
		//and can be used to operate on the elements after intermediate 
		//operations like filter, map, etc.
		list.stream()
		    .forEach(x->System.out.print(x+" "));
		
		//using Method references
		list.forEach(System.out::println);
		
		//Using parallelStream() in conjunction with forEach can
		//make iterations happen in parallel, leveraging multi-core processors.
		list.parallelStream()
		    .forEach(x->System.out.println(x));
		
		
		//forEach on a Map accepts a BiConsumer 
		//(a functional interface with accept(T t, U u) method) 
		//that operates on key-value pairs.
		Map<String, Integer>map=new HashMap<>();
		map.put("vinay",1);
		map.put("ajay", 2);
		map.put("sanjay", 3);
		map.forEach((str,key)->System.out.println("Name: "+str+" id: "+key));
		
		
		System.out.println("---------------------------");
		
		//list of list
		List<List<Integer>>innerList=Arrays.asList(
				Arrays.asList(1,2,3,4),
				Arrays.asList(3,4,5),
				Arrays.asList(4,5,6,7,7));
		innerList.forEach(i->{
			i.stream().distinct().forEach(j->System.out.println(j));
		});
	}
}
