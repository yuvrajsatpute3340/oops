package stream_api;

import java.util.function.Function;

public class Function_4 {

    public static void main(String[] args) {
        Function<String, Integer> fun = (s) -> {
            System.out.println("String length square...");
            return s.length() * s.length();
        };
        Function<Integer[], String> fun2 = (arr) -> {
            System.out.println("Array to String...");
            String s = "";
            for (int i : arr) {
                s = s + i;   
            }
            return s;
        };
        Function<Integer[], Integer> fun3 = fun.compose(fun2);

        System.out.println(fun3.apply(new Integer[]{1, 2, 3, 4}));
    }
}