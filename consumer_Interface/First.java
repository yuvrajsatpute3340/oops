package consumer_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class First {

	public static void main(String[] args) {
		
		List<Integer>list1=new ArrayList<Integer>();
		list1.add(23);
		list1.add(46);
		
		List<Integer>list2=new ArrayList<Integer>();
		list2.add(11);
		list2.add(15);
		
		List<List<Integer>>list3=new ArrayList<List<Integer>>();
		list3.add(list1);
		list3.add(list2);
		
		System.out.println(list3);
		
		Two_d tow=new Two_d();
		tow.accept(list3);
	}
}
class First_list implements Consumer<List<Integer>>
{

	@Override
	public void accept(List<Integer> t) {
		int sum=0;
		for(int i:t)
		{
			sum+=1;
		}
		System.out.println(sum);
	}
}
class Two_d implements Consumer<List<List<Integer>>>
{

	@Override
	public void accept(List<List<Integer>> t) {
		for (List<Integer>list:t)
		{
			First_list list2=new First_list();
		}
	}
	
}
