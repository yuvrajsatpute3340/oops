package stream_api;

import java.util.function.Supplier;

public class Supplier_3 {

	public static void main(String[] args) {

		Supplier<Integer> supplier=()->{return 1234;};
		System.out.println(supplier.equals(supplier));
		
		
		}
}
