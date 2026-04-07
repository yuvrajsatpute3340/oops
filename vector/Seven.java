package vector;
import java.util.Vector;

public class Seven {
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
        Vector<Integer> unique = new Vector<>();

        for(int i = 0; i < v.size(); i++) {
            if(!unique.contains(v.get(i))) {
                unique.add(v.get(i));
            }
        }

        System.out.println("Unique Elements: " + unique);
    }
}