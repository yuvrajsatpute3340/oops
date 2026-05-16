package practic_stream_op;

import java.util.stream.IntStream;

public class Six {

    public static void main(String[] args) {

        int[] arr = {2, 6, 10};

        IntStream.range(0, arr.length - 1)
                 .flatMap(i ->
                     IntStream.range(arr[i] + 1, arr[i + 1])
                 )
                 .forEach(System.out::println);
    }
}