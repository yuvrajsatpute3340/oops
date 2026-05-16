package practic_stream_op;

import java.util.stream.IntStream;

public class Eight {

    public static void main(String[] args) {

        int[] arr = {21, 25, 30, 34};

        IntStream.range(0, arr.length - 1)
                 .flatMap(i ->
                     IntStream.range(arr[i] + 1, arr[i + 1])
                 )
                 .forEach(System.out::println);
    }
}