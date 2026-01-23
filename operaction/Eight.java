package operaction;

import java.util.List;

public class Eight {

	
	public static int sqr(int i)
	{
		return i*i;
	}
	public static void main(String[] args) {
		List.of("hyds", "dhem")
        .stream()
        .map(String::length)
        .map(Eight::sqr)
        .forEach(System.out::println);;
		
	}

}
