package stream_operaction;

import java.util.List;
import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(11, 22, 33, 8, 44, 5, 6, 67, 0, 8, 6);

        Predicate<Integer> pred = p -> p > 10;
        list.stream()
            .filter(pred)
            .forEach(i -> System.out.println(i));
	}

}
