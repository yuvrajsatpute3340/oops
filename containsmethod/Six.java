package containsmethod;

import java.util.List;
import java.util.ArrayList;

public class Six {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(4);
        list.add(7);
        list.add(10);

        int start = list.get(0);
        int end = list.get(list.size() - 1);

        int num = start;

        for (int i = start; i <= end; i++) {
            if (!list.contains(num)) {
                System.out.println(num);
            }
            num++;
        }
    }
}