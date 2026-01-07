package predicate_fun;

import java.util.function.Predicate;

public class Second {

	public static void main(String[] args) {

		
		Predicate<String>p1=s->s.length()>10;
		Predicate<String>p2=s->s.startsWith("Y");
		System.out.println(p1.and(p2).test("Yuvraj"));//false
		System.out.println(p1.and(p2).test("Satpute"));//false
	}

}
