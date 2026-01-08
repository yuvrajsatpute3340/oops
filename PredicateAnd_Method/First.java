package PredicateAnd_Method;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		Predicate<String>p1=s->s.length()>5;
		Predicate<String>p2=s->s.startsWith("j");
		
		System.out.println(p1.and(p2).test("javaaaa"));
		System.out.println(p1.and(p2).test("JavaWord"));
	}

}
