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
	}

}
