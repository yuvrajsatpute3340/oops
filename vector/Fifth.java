package vector;

import java.util.Vector;
public class Fifth {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector elements: " + v);
        int sum = 0;
        for(int i = 0; i < v.size(); i++) {
            sum += v.get(i);
        }
        System.out.println("Sum of elements: " + sum);
        int max = v.get(0);
        for(int i = 1; i < v.size(); i++) {
            if(v.get(i) > max) {
                max = v.get(i);
            }
        }
        System.out.println("Maximum element: " + max);
        int search = 20;
        if(v.contains(search)) {
            System.out.println(search + " is found in vector");
        } else {
            System.out.println(search + " is not found");
        }
    }
}