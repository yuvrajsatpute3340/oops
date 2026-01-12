package stream_api;

import java.util.function.Function;

public class Function_2 {

	public static void main(String[] args) {
		
		Function<String,Integer>fun=(i)->{return i.length();};
		
		Function<Integer,Integer>fun2=(i)->{return i*5;};
		
		System.out.println(fun.apply(""));
		System.out.println(fun2.apply(10));
		
		Function<String,Integer>fun3=fun.andThen(fun2);
		
		System.out.println(fun3.apply("Wellcome"));
	}

}
