package containsmethod;

import java.util.*;

public class Seven {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(7);
        list.add(4);

        Collections.sort(list); //  important

        int start = list.get(0);
        int end = list.get(list.size() - 1);

        for (int i = start; i <= end; i++) {
            if (!list.contains(i)) {
                System.out.println(i);
            }
        }
    }
}