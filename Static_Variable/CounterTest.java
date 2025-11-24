package Static_Variable;

class Counter {
    static int count = 0;  

    Counter() {
        count++;   
        }
}

public class CounterTest {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Number of objects created: " + Counter.count);
    }
}
