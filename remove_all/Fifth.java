package remove_all;

public class Fifth {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20, 50};
        int valueToRemove = 20;

        int n = arr.length;
        int newSize = 0;   
        for (int i = 0; i < n; i++) {
            if (arr[i] != valueToRemove) {
                arr[newSize] = arr[i];
                newSize++;    
            }
        }

        System.out.println("Array after removing all " + valueToRemove + ":");
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
