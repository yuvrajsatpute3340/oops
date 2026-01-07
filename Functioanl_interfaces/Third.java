package Functioanl_interfaces;

import java.util.function.Predicate;

public class Third {

	public static void main(String[] args) {
		
		Predicate<Integer>pred=(i)->{
			System.out.println("A");
			return i.toString().startsWith("1");
		};
		Predicate<Integer>p2=(i)->{
			System.out.println("B");
			return i>100;
		};
		Predicate<Integer> p3=pred.and(p2);
		Predicate<Integer>p4=p3.negate();
		Predicate<Integer>p=Predicate.not((i)->{return i>10;});
		System.out.println(p.test(5));
	}

}
