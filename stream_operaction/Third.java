package stream_operaction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Third {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

        list.add("Unique");
        list.add("System");
        list.add("pvt");
        list.add("ltd");

        System.out.println(list);

        Function<String, String> fun2 = t -> t.toUpperCase();
        Function<String, String> fun = t -> new StringBuffer(t).reverse().toString();
        Consumer<String> con = i -> System.out.println(i);

        list.stream().map(fun2)
            .map(fun).forEach(con);
            
    }
}
