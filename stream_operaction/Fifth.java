package stream_operaction;

import java.util.List;

public class Fifth {

	public static void main(String[] args) {
		
		List.of(11,22,33,44,55,66,77,88,99)
	    .stream()
	    .sorted((i, j) -> Integer.compare(j, i)) 
	    .forEach(i -> System.out.println(i));
	}

}
