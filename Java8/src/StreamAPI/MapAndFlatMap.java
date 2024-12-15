package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapAndFlatMap {

	public static void main(String[] args) {
		
		//Map
		List<String>listMap=Arrays.asList("vinay","ajay","sanjay");
		listMap.stream()
		       .map(x->x.toUpperCase())// or we can use map(String::toUpperCase)
		       .peek(x->System.out.print(x+" "))
		       .collect(Collectors.toList());
		
		
		//FlatMap
		List<List<Integer>>listFlatMap=Arrays.asList(
				Arrays.asList(1,2),
				Arrays.asList(2,3),
				Arrays.asList(3,4));
		listFlatMap.stream()
		           .flatMap(x->x.stream()) //or we can use flatMap(List::Stream)
		           .distinct()
		           .peek(x->System.out.println(x))
		           .collect(Collectors.toList());
		           
		
	}
}
