package lambdas;

public class Eight {

    public static void main(String[] args) {

        // Lambda Expression
        I_Salary<Integer, String> salary = (basic, bonus, deduction) -> {

            int netSalary = basic + bonus - deduction;

            return "Net Salary = " + netSalary;
        };

        String result = salary.calculateSalary(50000, 8000, 3000);

        System.out.println(result);
    }
}

// Functional Interface
interface I_Salary<T, R> {

    R calculateSalary(T t1, T t2, T t3);
}