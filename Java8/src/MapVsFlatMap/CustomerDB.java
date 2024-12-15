package MapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB {

	public static List<Customer> getAll(){
		return Stream.of(
				new Customer("vinay",1,"vinay@gmail.com",Arrays.asList("22332","232323","2","2")),
				new Customer("ajay",2,"ajay@gmail.com",Arrays.asList("23232","34343")))
				.collect(Collectors.toList());
	}
}
