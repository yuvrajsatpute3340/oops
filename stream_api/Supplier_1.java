package stream_api;

import java.util.function.Supplier;

public class Supplier_1 {

	public static void main(String[] args) {
		
		Supplier<Double>otp=()->{return Math.random()*10000;};
		System.out.println(otp.get().intValue());
	}

}
