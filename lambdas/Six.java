package lambdas;

public class Six {

    public static void main(String[] args) {

        // Lambda expression
        I_Calculate<Integer, String> bonusCalc = (salary, bonus, extraAllowance) -> {

            int totalIncome = salary + bonus + extraAllowance;

            return new StringBuffer("Total Employee Income: ")
                    .append(totalIncome)
                    .toString();
        };

        String result = bonusCalc.calculate(50000, 10000, 5000);

        System.out.println(result);
    }
}

// Functional Interface
interface I_Calculate<T, R> {

    R calculate(T t1, T t2, T t3);
}