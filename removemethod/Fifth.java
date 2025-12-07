package removemethod;

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int indexToRemove = 2;  

        
        for (int i = indexToRemove; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

       
        System.out.println("Array after removal:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
