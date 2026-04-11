package vector;
import java.util.Vector;
import java.util.LinkedHashSet;

public class Ten {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Red");
        v.add("Blue");
        v.add("Green");
        v.add("Red");
        v.add("Yellow");
        v.add("Blue");
        v.add("Pink");

        System.out.println("Original Vector: " + v);

        LinkedHashSet<String> set = new LinkedHashSet<>(v);

        Vector<String> unique = new Vector<>(set);

        System.out.println("Unique Elements: " + unique);
    }
}