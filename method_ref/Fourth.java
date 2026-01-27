package method_ref;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fourth {

	public static void main(String[] args) {
		
		 List<String> list = List.of("Y", "U", "V", "R", "A", "J");

	        Map<String, List<String>> set = list.stream()
	                .collect(Collectors.groupingBy(i -> i));

	        Map<String, Integer> mp2 = new HashMap<>();

	        for (Map.Entry<String, List<String>> mp : set.entrySet()) {
	            System.out.println(mp.getKey() + " = " + mp.getValue().size());
	            
	            mp2.put(mp.getKey(), mp.getValue().size());
	        }

	        System.out.println("set = " + set);
	        System.out.println("mp2 = " + mp2);
	  
	}

}
