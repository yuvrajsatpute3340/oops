package Conditional;
public class Demo_8 {

    public static void main(String[] args) {
        int batteryPercentage = 80;
        boolean internetConnected = true;

        if (batteryPercentage > 20 && internetConnected)
        {
            System.out.println("Video Call Started");
        }
        else
        {
            System.out.println("Unable to Start Video Call");
        }
    }
}