package removemethod;

import java.util.*;

public class Six {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {5, 10, 15, 20, 25};
        int n = arr.length;

        System.out.print("Enter index to remove: ");
        int index = sc.nextInt();

        if (index < 0 || index >= n) {
            System.out.println("Invalid index!");
            return;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];   
        }

        System.out.println("Array after removal:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
