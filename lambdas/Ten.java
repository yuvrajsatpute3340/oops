package lambdas;

public class Ten {

    public static void main(String[] args) {

        // Lambda Expression
        I_Temperature<Integer, String> temp = (morning, afternoon, evening) -> {

            int averageTemp = (morning + afternoon + evening) / 3;

            return "Average Temperature = " + averageTemp + "°C";
        };

        String result = temp.calculateAverage(28, 35, 30);

        System.out.println(result);
    }
}

// Functional Interface
interface I_Temperature<T, R> {

    R calculateAverage(T t1, T t2, T t3);
}