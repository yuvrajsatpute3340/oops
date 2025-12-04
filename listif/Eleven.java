package listif;

import java.util.ArrayList;
import java.util.List;

public class Eleven {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		List<Integer> list2=list.reversed();
		System.out.println(list2);
		
	}

}
