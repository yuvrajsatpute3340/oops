package predicateNegate_Method;

import java.util.function.Predicate;


public class First {

	public static void main(String[] args) {
		
		Predicate<String>p=s->s.isEmpty();
		
		System.out.println(p.test(""));
		System.out.println(p.negate().test(""));

		
	}

}
