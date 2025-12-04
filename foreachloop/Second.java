package foreachloop;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Sam");
        names.add("Jenny");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
