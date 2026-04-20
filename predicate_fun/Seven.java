package predicate_fun;

import java.util.function.Predicate;

public class Seven {

	public static void main(String[] args) {
		Predicate<Integer> p1 = n -> n > 10;
		Predicate<Integer> p2 = n -> n % 2 == 0;

		System.out.println(p1.and(p2).test(12)); // true (greater than 10 AND even)
		System.out.println(p1.and(p2).test(9));  // false (not > 10)
		System.out.println(p1.and(p2).test(13)); // false (not even)

	}

}
