package lambdas;

public class Seven {

    public static void main(String[] args) {

        // Lambda Expression
        I_Bill<Integer, String> bill = (item1, item2, item3) -> {

            int total = item1 + item2 + item3;

            return "Total Shopping Bill = " + total;
        };

        String result = bill.generateBill(250, 400, 150);

        System.out.println(result);
    }
}

// Functional Interface
interface I_Bill<T, R> {

    R generateBill(T t1, T t2, T t3);
}