package stack;

import java.util.Stack;

public class Eight {
    public static void main(String[] args) {

        Stack<Integer> recharge = new Stack<>();

        recharge.add(199);
        recharge.add(299);
        recharge.add(399);
        recharge.add(499);
        recharge.add(599);

        System.out.println("Removed Recharge: " + recharge.remove(0));
        System.out.println("Recharge Stack: " + recharge);
        System.out.println("Latest Recharge: " + recharge.peek());
    }
}