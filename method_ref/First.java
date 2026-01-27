package method_ref;

import java.util.List;

public class First {

	public static void main(String[] args) {
		
		String great="Hello";
		List.of("Pune","Mumbai","Nagar","Nagpur","Solapur")
		.stream()
		.map(great::concat)
		.map(String::toUpperCase)
		.forEach((i)->{System.out.println(i);});
		
//		Integer gerat=6390;
//		List.of(10,20,30,40,50,60,70,80,90)
//		.stream()
//		.map(i -> gerat + i)
//		.toList()
//		.forEach((i)->{System.out.println(i);});
	}

}
