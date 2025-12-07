package shifitingindex;

public class Four {
    public static int[] leftShift(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + k) % n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] shifted = leftShift(arr, 2);

        for (int x : shifted)
            System.out.print(x + " ");
    }
}
