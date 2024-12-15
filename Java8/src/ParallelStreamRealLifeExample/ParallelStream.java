package ParallelStreamRealLifeExample;

import java.util.List;
import java.util.stream.IntStream;

//let see simple example where we have to evaluate 1000 records 
//and find the execution time of normal and parallel stream
public class ParallelStream {

	public static void main(String[] args) {
		
		
		//get the list of data from the CustomerDB and 
		//evaluate avg difference between sequential and parallel stream 
		//then we find the actual difference between these two
		List<Customer>customers=CustomerDB.getCustomersRecords();
		long startTime=0;
		long endTime=0;
		
		//Normal Stream
		startTime=System.currentTimeMillis();
		double normalStream=customers.stream()
		         .map(x->x.getSalary()).mapToDouble(i->i)
		         .average().getAsDouble();
		endTime=System.currentTimeMillis();
		System.out.println("Execution time by Normal Stream: "+(endTime-startTime)+" and Salary is: "+normalStream);
		
		//Parallel Stream
		//if you have list of object then parallel() method is not work
		startTime=System.currentTimeMillis();
		double parallelStream=customers.parallelStream()
		         .map(x->x.getSalary()).mapToDouble(i->i)
		         .average().getAsDouble();
		endTime=System.currentTimeMillis();
		System.out.println("Execution time by Parallel Stream: "+(endTime-startTime)+" and Salary is: "+parallelStream);
		
	}
}
