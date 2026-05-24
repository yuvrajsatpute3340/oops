package lambdas;

public class Nine {

    public static void main(String[] args) {

        // Lambda Expression
        I_Result<Integer, String> result = (maths, science, english) -> {

            int totalMarks = maths + science + english;
            double percentage = totalMarks / 3.0;

            return "Student Percentage = " + percentage + "%";
        };

        String output = result.calculateResult(85, 90, 80);

        System.out.println(output);
    }
}

// Functional Interface
interface I_Result<T, R> {

    R calculateResult(T t1, T t2, T t3);
}