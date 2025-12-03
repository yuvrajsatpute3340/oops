package shifitingindex;

import java.util.ArrayList;
import java.util.Collections;

public class Three {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");

        Collections.rotate(letters, 1);

        System.out.println("ArrayList after rotating: " + letters);
    }
}
