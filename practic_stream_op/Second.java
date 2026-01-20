package practic_stream_op;

import java.util.Arrays;
import java.util.List;

public class Second {
	
	public static void main (String []args) {
		
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3, 7);

        numbers.stream()         
               .sorted()          
               .skip(2)           
               .limit(1)         
               .forEach((n) -> {System.out.println(n);});
	}

}
