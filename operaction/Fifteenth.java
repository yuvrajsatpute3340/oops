package operaction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Fifteenth {

	public static void main(String[] args) {
		
		List<Integer>even=List.of(23,45,67,889,75,45,67,83).stream().collect(new NumberCollecter());
		
		System.out.println(even);
		
	}
}
class NumberCollecter implements Collector<Integer,List<Integer>,List<Integer>>
{

	@Override
	public Supplier<List<Integer>> supplier() {
		return ArrayList::new;
	}

	@Override
	public BiConsumer<List<Integer>, Integer> accumulator() {
		return (t,u)->{
			System.out.println("U::::"+u);
			if (u%2==0)
			{
				t.add(u);
			}
			};
	}

	@Override
	public BinaryOperator<List<Integer>> combiner() {
		return (t1,t2)->{t1.addAll(t2);
		return t1;
		};
	}

	@Override
	public Function<List<Integer>, List<Integer>> finisher() {
		return (list)->{return list;};
	}

	@Override
	public Set<Characteristics> characteristics() {
		return new HashSet<Collector.Characteristics>();
	}
	
}
