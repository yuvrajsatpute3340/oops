package vector;

import java.util.Vector;

public class Six {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(11);
        v.add(20);
        v.add(33);
        v.add(40);
        v.add(55);

        System.out.println("Vector elements: " + v);
        int even = 0, odd = 0;

        for(int i = 0; i < v.size(); i++) {
            if(v.get(i) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
        System.out.print("Reverse Vector: ");
        for(int i = v.size() - 1; i >= 0; i--) {
            System.out.print(v.get(i) + " ");
        }
    }
}