package predicate_fun;

import java.util.function.Predicate;

public class Eight {

	public static void main(String[] args) {
		Predicate<String> p1 = s -> s.length() > 5;
		Predicate<String> p2 = s -> s.startsWith("A");

		System.out.println(p1.or(p2).test("Apple"));  // true (starts with A)
		System.out.println(p1.or(p2).test("Banana")); // true (length > 5)
		System.out.println(p1.or(p2).test("Cat"));    // false (none match)
	}

}
