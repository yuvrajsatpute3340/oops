package vector;

import java.util.Vector;

public class Third {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Mango");

        System.out.println("Before remove: " + v);

        v.remove(1);  
        System.out.println("After remove: " + v);
    }
}
