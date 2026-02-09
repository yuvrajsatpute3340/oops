package listif;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(15);
		list.add(20);
		
		int num=list.getFirst();
		for (int i=list.getFirst();i<=list.getLast();i++)
		{
			if (! list.contains(num))
			{
				System.out.println(num);
			}
			num++;
		}
		
	//	System.out.println(list);
		

	}

}
