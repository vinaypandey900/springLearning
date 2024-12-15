package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class AllAnyNoneMatchStream {

	public static void main(String[] args) {
		
		//allMatch
		List<Integer>list=Arrays.asList(2,20,30,40,50);
		boolean check=list.stream()
		    .allMatch(x->x%2==0);
		System.out.println(check);
		
		//anyMatch
	   boolean check2=list.stream()
		    .anyMatch(x->x%26==0);
	   System.out.println(check2);
	   
	   //noneMatch
	   boolean check3=list.stream()
			              .noneMatch(x->x>0);
	   System.out.println(check3);
	}
}
