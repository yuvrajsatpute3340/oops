package predicate_fun;

import java.util.function.Predicate;

public class Six {
    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() > 3;
        Predicate<String> p2 = s -> s.startsWith("A");

        System.out.println(p1.and(p2).test("Apple"));   // true
        System.out.println(p1.and(p2).test("Bat"));     // false
    }
}