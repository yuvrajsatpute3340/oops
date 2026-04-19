package removemethod;

import java.util.ArrayList;
import java.util.List;

public class Eight {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        num.remove(Integer.valueOf(20)); // value remove

        System.out.println(num);
    }
}