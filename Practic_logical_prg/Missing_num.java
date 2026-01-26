package Practic_logical_prg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Missing_num {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		IntStream.rangeClosed(9,15)
		.forEach((i)->{
			if(!list.contains(i));
			{
				System.out.println(i);
			}
			});
	}

}
