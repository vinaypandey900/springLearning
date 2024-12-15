package ParallelStreamRealLifeExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CustomerDB {

	public static List<Customer>getCustomersRecords() {
		//here i am creating the 1000 records and perform some data
		//manipulation so that we easily find
		//the actual difference of time b/w sequence and parallel stream
		List<Customer>customers=new ArrayList<>();
		for(int i=0;i<100000;i++) {
			customers.add(new Customer("Customer "+i,i,"cutomer"+i+"@gmail.com",Double.valueOf(new Random().nextInt(1000*100))));
		}
		return customers;
	}
}
