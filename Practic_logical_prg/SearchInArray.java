package Practic_logical_prg;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {

        int[] arr = {5, 8, 12, 20, 33};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found!");
        else
            System.out.println("Element not found!");

        sc.close();
    }
}
