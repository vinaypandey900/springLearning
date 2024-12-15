package Lambda;

interface addable{
	int addImpl(int a,int b);
}

public class LambdaParameter {

	public static void main(String [] args) {
		//here there is a single statement so 
		//we can remove return and return type.
		addable add= ( a, b)->a+b;
		int result=add.addImpl(10, 20);
		System.out.println(result);
	}
}
