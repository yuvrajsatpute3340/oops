package stream_api;

import java.util.function.Supplier;

public class Supplier_2 {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> {return "Hello, Supplier!";};

        System.out.println(supplier.get());
    }
}

