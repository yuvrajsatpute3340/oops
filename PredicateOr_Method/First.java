package PredicateOr_Method;

import java.util.function.Predicate;

public class First {
	public static void main (String []args) {

		Predicate<Integer>p1=x->x>50;
		Predicate<Integer>p2=x->x<10;
		
		System.out.println(p1.or(p2).test(5));
		System.out.println(p1.or(p2).test(60));
		System.out.println(p1.or(p2).test(30));
		
}
}
