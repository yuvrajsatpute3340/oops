package stream_api;

import java.util.function.Supplier;

public class Supplier_4 {

    public static void main(String[] args) {

        Supplier<String> nameSupplier = () -> {
            String[] names = {"Ram", "Shyam", "Amit", "Neha"};
            int index = (int) (Math.random() * names.length);
            return names[index];
        };

        System.out.println("Random Name: " + nameSupplier.get());
    }
}