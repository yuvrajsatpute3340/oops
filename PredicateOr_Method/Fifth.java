package PredicateOr_Method;

import java.util.function.Predicate;

public class Fifth {
    public static void main(String[] args) {

        Predicate<String> isAdmin = role -> role.equals("ADMIN");
        Predicate<String> isManager = role -> role.equals("MANAGER");

        System.out.println(isAdmin.or(isManager).test("USER"));    // false
        System.out.println(isAdmin.or(isManager).test("ADMIN"));   // true
        System.out.println(isAdmin.or(isManager).test("MANAGER")); // true
    }
}