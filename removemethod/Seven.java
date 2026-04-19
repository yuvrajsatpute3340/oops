package removemethod;

import java.util.ArrayList;
import java.util.List;

public class Seven {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Rahul");
        names.add("Sneha");
        names.add("Pooja");
        names.add("Neha");

        System.out.println("Removed Name: " + names.remove(2));
        System.out.println(names);
    }
}