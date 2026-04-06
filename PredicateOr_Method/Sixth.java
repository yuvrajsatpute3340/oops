package PredicateOr_Method;

import java.util.function.Predicate;

public class Sixth {
    public static void main(String[] args) {

        Predicate<Integer> bigOrder = amount -> amount > 1000;
        Predicate<Integer> primeUser = amount -> amount == 0; // assume 0 = prime user

        System.out.println(bigOrder.or(primeUser).test(500));   // false
        System.out.println(bigOrder.or(primeUser).test(0));     // true
        System.out.println(bigOrder.or(primeUser).test(1500));  // true
    }
}