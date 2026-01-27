package method_ref;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Second {

	public static void main(String[] args) {
		List<StringBuffer>listt=List.of("Hello","cello")
		.stream()
		.collect(new Custom_Collector());
		System.out.println(listt);
		
	}
}
class Custom_Collector implements Collector<String,List<StringBuffer>,List<StringBuffer>>
{

	@Override
	public Supplier<List<StringBuffer>> supplier() {
		return ()->{System.out.println("step supplier");
		return new ArrayList<StringBuffer>();};
		}

	@Override
	public BiConsumer<List<StringBuffer>, String> accumulator() {
		return (t,u)->{
			System.out.println("accumlator");
			System.out.println("U:"+u);
			t.add(new StringBuffer(u).reverse());
		};
		}

	@Override
	public BinaryOperator<List<StringBuffer>> combiner() {
		return (t1,t2)->{
			t1.addAll(t2);
			return t1;
		};
	}

	@Override
	public Function<List<StringBuffer>, List<StringBuffer>> finisher() {
		return (t)->{
			System.out.println("step last");
			return t;};
		}

	@Override
	public Set<Characteristics> characteristics() {
		return new HashSet<Collector.Characteristics>();
	}
	}
