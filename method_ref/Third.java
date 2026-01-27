package method_ref;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Third {

	public static void main(String[] args) {
		
	//Map<Integer,String>mp=List.of("ab67ui","ssdd","hdgjds","aaaa")
//				.stream()
//				.collect(Collectors.toMap(String::length,String::new,(first,second)->{return second;}));
//		System.out.println(mp);
		
		
		
		Map<Integer,List<String>>mp=List.of("ab67ui","ssdud","hdgjds","aaaa","yu")
				.stream()
				.collect(Collectors.groupingBy((i)->{return i.length();}));
		System.out.println(mp);

	}
}
