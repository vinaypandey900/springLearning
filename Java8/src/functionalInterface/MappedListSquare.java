package functionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//with lambda operation and map
public class MappedListSquare {
	public static void main(String [] args) {
		Function<Integer, Integer> sq=(Integer t)-> t*t;
		List<Integer>list= Arrays.asList(1,2,3,4);
		//Here, we don't use apply() method
		//because map internally called this
		List<Integer>sqFun=list.stream()
				               .map(sq)
				               .collect(Collectors.toList());
		System.out.println(sqFun);
	}
}
