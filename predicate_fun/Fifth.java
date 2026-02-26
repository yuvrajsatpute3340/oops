package predicate_fun;

import java.util.function.Predicate;

public class Fifth {
    public static void main(String[] args) {

        Predicate<String> p1 = email -> email.contains("@");
        Predicate<String> p2 = email -> email.endsWith(".com");

        System.out.println(p1.and(p2).test("example@gmail.com")); // true
        System.out.println(p1.and(p2).test("user@yahoo.in"));     // false
    }
}