package Lambda;

class threadDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running");
	}
}
public class LambdaRunnableExample {
	public static void main(String [] args) {
		Runnable runnable=()-> System.out.println("Thread is running under lambda expression");
		Thread thread=new Thread(runnable);
		//or we can directly pass this lambda expression on constructor.
		//Thread thread =new Thread(()-> System.out.println("Thread is running under lambda expression"));
		thread.start();
	}
}
