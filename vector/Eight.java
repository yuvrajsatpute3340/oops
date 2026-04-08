package vector;
import java.util.Vector;
import java.util.LinkedHashSet;

public class Eight {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(10);
        v.add(30);
        v.add(20);
        v.add(40);
        v.add(50);

        System.out.println("Original Vector: " + v);
        LinkedHashSet<Integer> set = new LinkedHashSet<>(v);

        Vector<Integer> unique = new Vector<>(set);

        System.out.println("Unique Elements: " + unique);
    }
}