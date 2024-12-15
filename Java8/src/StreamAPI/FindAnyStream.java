package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyStream {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(200,20,202,90);
		Optional<Integer>optional= list.stream()
		                               .filter(x->x%2==0)
		                               .peek(x->System.out.println(x))
		                               .findAny();
		optional.ifPresent(x->System.out.println(x));
	}
}
