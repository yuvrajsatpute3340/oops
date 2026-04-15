package containsmethod;

import java.util.List;
import java.util.ArrayList;

public class Fifth {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        list.add(11);
        list.add(13);
        list.add(15);
        list.add(17);
        list.add(20);

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