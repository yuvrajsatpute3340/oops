package queue_interface;

import java.util.LinkedList;

public class Six {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		for(int i=1;i<100001;i++)
		{
			list.add(i);
		}
		long StartTime=System.nanoTime();
		list.remove(5001);
		long endTime=System.nanoTime();
		System.out.println((endTime-StartTime)/100);
	}

}
