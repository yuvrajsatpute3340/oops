package operaction;

import java.util.List;

public class Seven {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("hello");
		List.of("abcd","xyza","hgjs")
		.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}

}
