package Functioanl_interfaces;

import java.util.function.Predicate;

public class First {
	public static void main(String[] args) {
		
		Demo d=new Demo();
		System.out.println(d.test(23));
		
		Predicate<String>pred=(s)->
		{
			return s.length()>10;
		};
		System.out.println(pred.test("yuvraj"));
	}
}
class Demo implements Predicate<Integer>
{
	public boolean test(Integer t)
	{
		return t>10;
	}
}
