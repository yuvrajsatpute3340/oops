package removemethod;

import java.util.ArrayList;
import java.util.List;

public class Nine {

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        for(int i=1; i<=10; i++) {
            num.add(i);
        }

        num.removeIf(n -> n % 2 == 0);

        System.out.println(num);
    }
}