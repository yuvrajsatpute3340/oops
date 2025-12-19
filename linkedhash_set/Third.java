package linkedhash_set;

import java.util.LinkedHashSet;

public class Third {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");

        cities.remove("Mumbai");

        System.out.println("Contains Delhi? " + cities.contains("Delhi"));
        System.out.println("Size of LinkedHashSet: " + cities.size());
        System.out.println("Cities: " + cities);
    }
}
