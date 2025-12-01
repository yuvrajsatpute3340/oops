package listif;

import java.util.ArrayList;
import java.util.List;

public class Third {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();

        names.add("Rahul");
        names.add("Sneha");
        names.add("Amit");
        
        System.out.println("Names: " + names);

        System.out.println("First name: " + names.get(0));

        System.out.println("Size: " + names.size());

        names.remove("Sneha");

        System.out.println("Updated Names: " + names);
    }
}
