package predicate_fun;

import java.util.function.Predicate;

public class Fourth {
    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() > 5;
        Predicate<String> p2 = s -> s.contains("Pro");

        System.out.println(p1.and(p2).test("MacBook Pro"));  // true
        System.out.println(p1.and(p2).test("iPad"));         // false
    }
}