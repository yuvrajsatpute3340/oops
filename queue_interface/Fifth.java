package queue_interface;

import java.util.LinkedList;

public class Fifth {

	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<Integer>();
		
		for(int i=0;i<500;i++)
		{
			list.add(i);
		}
		long StartTime=System.nanoTime();
		System.out.println(list.get(400));
		long endTime=System.nanoTime();
		System.out.println((endTime-StartTime)/100);
		}

}
