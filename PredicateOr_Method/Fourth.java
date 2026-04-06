package PredicateOr_Method;

import java.util.function.Predicate;

public class Fourth {
    public static void main(String[] args) {

        Predicate<Integer> experienced = years -> years >= 5;
        Predicate<Integer> fresherDrive = years -> years == 0;

        System.out.println(experienced.or(fresherDrive).test(2)); // false
        System.out.println(experienced.or(fresherDrive).test(0)); // true
        System.out.println(experienced.or(fresherDrive).test(6)); // true
    }
}