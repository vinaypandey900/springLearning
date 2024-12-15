package functionalInterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

//with lambda expression
public class SupplierFunctionalInterface {
	public static void main(String[] args) {
		Supplier<LocalDateTime>supplier=()->LocalDateTime.now();
		System.out.println(supplier.get());
	}
}

