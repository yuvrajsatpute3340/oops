package stream_operaction;

import java.util.List;

public class Fourth {

	public static void main(String[] args) {
		
		 List.of("abc", "abcd", "xyz")
         .stream()
         .map(s -> new StringBuffer(s).reverse().toString())
         .forEach(s -> System.out.println(s));
	}

}
