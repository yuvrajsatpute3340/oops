package stack;

import java.util.Stack;

public class Ten {
    public static void main(String[] args) {

        Stack<Integer> atm = new Stack<>();

        atm.add(1000);
        atm.add(2000);
        atm.add(3000);
        atm.add(4000);
        atm.add(5000);

        System.out.println("Removed Transaction: " + atm.remove(2));
        System.out.println("ATM Stack: " + atm);
        System.out.println("Latest Transaction: " + atm.peek());
    }
}