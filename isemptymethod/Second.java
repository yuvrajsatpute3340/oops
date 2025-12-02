package isemptymethod;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Is numbers list empty? " + numbers.isEmpty());

        numbers.add(10);
        System.out.println("After adding an element, is it empty? " + numbers.isEmpty());
    }
}
