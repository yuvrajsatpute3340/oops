package shifitingindex;

import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        int first = list.remove(0); 
        list.add(first); 

        System.out.println("ArrayList after shifting left: " + list);
    }
}
