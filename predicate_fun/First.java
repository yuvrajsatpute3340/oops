package predicate_fun;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		Predicate<Integer>p=x->x>10;
		System.out.println(p.test(5));//false
		System.out.println(p.test(20));//true
		
	}
}
