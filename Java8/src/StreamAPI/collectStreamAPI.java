package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collectStreamAPI {

	public static void main(String[] args) {
		
		//collecting into a list
		List<Integer>list=Arrays.asList(1,2,3,4,5);
		List<Integer>collectedList=list.stream()
		    .filter(n->n%2==0)
		    .collect(Collectors.toList());
		System.out.println(collectedList);
		
		//collecting into a set
		Set<Integer>set=Stream.of(1,2,3,4,5)
				              .collect(Collectors.toSet());
		System.out.println(set);
		
		//collecting into a map
		Map<String, Integer>map=Stream.of("Hello","World","Name","Develop")
				              .collect(Collectors.toMap(str->str,len->len.length() 
				            		                            ));
		System.out.println(map);
		
	}
}
