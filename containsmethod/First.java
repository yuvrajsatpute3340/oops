package containsmethod;

import java.util.List;
import java.util.ArrayList;

public class First {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(11);
		list.add(13);
		list.add(15);
		list.add(17);
		list.add(20);
		
		int num =list.getFirst();
		for(int i=list.getFirst();i<=list.getLast();i++)
		{
			if(list.contains(num)==false)
			{
				System.out.println(num);
			}
			num++;
		}
	}

}
