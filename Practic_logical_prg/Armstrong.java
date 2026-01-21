package Practic_logical_prg;

public class Armstrong {
    public static void main(String[] args) {
        int num = 143, temp = num, sum = 0;

        while(temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if(sum == num)
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is not Armstrong");
    }
}
