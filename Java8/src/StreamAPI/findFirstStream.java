package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirstStream {

	public static void main(String[] args) {
		
    List<Integer>list=Arrays.asList(1,2,3,4,5);
    Optional<Integer>res=list.stream()
        .findFirst();
    System.out.println(res.get());
	}
}
