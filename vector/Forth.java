package vector;

import java.util.Vector;

public class Forth {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(5);
        v.add(10);
        v.add(15);

        System.out.println("Using for-each loop:");
        for (int num : v) {
            System.out.println(num);
        }
    }
}
