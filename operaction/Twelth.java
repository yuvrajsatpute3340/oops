package operaction;

import java.util.Arrays;
import java.util.List;

public class Twelth {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,13,14);
		List<Integer>list2=Arrays.asList(20,20,20);
		
		List<Integer>list3=Arrays.asList(12,13,14);
		List<Integer>list4=Arrays.asList(20,20,20);
		
		List<List<Integer>>list5=Arrays.asList(list,list2);
		List<List<Integer>>list6=Arrays.asList(list3,list4);
		List<List<List<Integer>>>list7=Arrays.asList(list5,list6);
		
		int sum=list7.stream()
				.flatMap((i)->{return i.stream();})
				.flatMap((i)->{return i.stream();})
				.reduce(0,(i,j)->(i+j));
		
		System.out.println(sum);
		System.out.println(list7);


	}

}
