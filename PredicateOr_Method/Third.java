package PredicateOr_Method;

import java.util.function.Predicate;

public class Third {
    public static void main(String[] args) {

        Predicate<Integer> highPurchase = amount -> amount > 5000;
        Predicate<Integer> festivalOffer = amount -> amount == 3000;

        System.out.println(highPurchase.or(festivalOffer).test(2000)); // false
        System.out.println(highPurchase.or(festivalOffer).test(3000)); // true
        System.out.println(highPurchase.or(festivalOffer).test(7000)); // true
    }
}