package vector;
import java.util.Vector;
import java.util.LinkedHashSet;

public class Night {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Apple");
        v.add("Banana");
        v.add("Apple");
        v.add("Mango");
        v.add("Banana");
        v.add("Orange");
        v.add("Grapes");

        System.out.println("Original Vector: " + v);

        LinkedHashSet<String> set = new LinkedHashSet<>(v);

        Vector<String> unique = new Vector<>(set);

        System.out.println("Unique Elements: " + unique);
    }
}