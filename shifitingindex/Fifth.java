package shifitingindex;

public class Fifth {
    public static void main(String[] args) {
        int[] arr = {7, 14, 21, 28};
        int n = arr.length;

        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;

        System.out.print("Array after shifting right: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}