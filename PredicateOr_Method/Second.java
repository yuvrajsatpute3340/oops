package PredicateOr_Method;

import java.util.function.Predicate;

public class Second {
    public static void main(String[] args) {

        Predicate<Integer> pass = marks -> marks >= 40;
        Predicate<Integer> topper = marks -> marks > 90;

        System.out.println(pass.or(topper).test(35)); // false
        System.out.println(pass.or(topper).test(45)); // true
        System.out.println(pass.or(topper).test(95)); // true
    }
}