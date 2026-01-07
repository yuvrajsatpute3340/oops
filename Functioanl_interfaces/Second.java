package Functioanl_interfaces;

import java.util.function.Predicate;

public class Second {

	public static void main(String[] args) {
		
		Predicate<String>pred=(s)->
		{
			StringBuffer sb=new StringBuffer(s);
			String s1=sb.reverse().toString();
			return s.equals(s1);
		};
		Predicate<String>p2=(i)->{return i.length()>5;};
		Predicate<String> p3=pred.and(p2);
		System.out.println(p3.test("aaaaaa"));
	}
}
