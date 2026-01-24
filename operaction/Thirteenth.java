package operaction;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Thirteenth {

	public static void main(String[] args) {
		
		StringBuffer sb = List.of("****", "hfh", "ufjgh")
                .stream()
                .collect(new StringCollector());

System.out.println(sb);
}
}

class StringCollector implements Collector<String, StringBuffer, StringBuffer> {

@Override
public Supplier<StringBuffer> supplier() {
return StringBuffer::new;
}

@Override
public BiConsumer<StringBuffer, String> accumulator() {
return StringBuffer::append;
}

@Override
public BinaryOperator<StringBuffer> combiner() {
return (sb1, sb2) -> {
sb1.append(sb2);
return sb1;
};
}

@Override
public Function<StringBuffer, StringBuffer> finisher() {
return Function.identity();
}

@Override
public Set<Characteristics> characteristics() {
Set<Characteristics> set = new HashSet<>();
set.add(Characteristics.IDENTITY_FINISH);
return set;

	}
	
}