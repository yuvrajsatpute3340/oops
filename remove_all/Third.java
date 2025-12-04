package remove_all;

import java.util.ArrayList;

public class Third {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> removeList = new ArrayList<>();
        removeList.add(20);
        removeList.add(40);

        numbers.removeAll(removeList);
        System.out.println(numbers); 
    }
}
