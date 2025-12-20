package setif;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class logical {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		
		List<Integer> list=new ArrayList<Integer>();
		
		System.out.println("set:"+set);
		
		list.add(30);
		list.add(20);
		
		System.out.println("List:"+list);
		set.retainAll(list);
		System.out.println("retained set:"+set);
	}

}
