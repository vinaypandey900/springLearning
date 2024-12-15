package Interface;

interface C{
	static void test() {
		System.out.println("Hey test");
	}
}
interface D{
	static void test() {
		System.out.println("Hey man");
	}
}
public class staticInterface implements C,D{
	public static void main(String[] args) {
		C.test();
		C.test();
	}
	static void test() {
		System.out.println("Inside the test method of main");
	}
}