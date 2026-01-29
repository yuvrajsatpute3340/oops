package opectional_class;

import java.util.Optional;

public class Third {

	public static void main(String[] args) throws Exception
	{
		
		//orElse()
		Optional<String>ops=Optional.ofNullable("Yuvraj");
		System.out.println(ops.or(()->(Optional.of("No value present"))));
		System.out.println(ops.orElse("yoy"));
		System.out.println(ops.orElseGet(()->("No value")));
		System.out.println(ops.orElseThrow(()->(new Exception("No value"))));
		
		//faltemap()
		//Optional<Integer>ops=Optional.ofNullable(10);
		//System.out.println(ops.flatMap((i)->(Optional.of(i*2))).get());//20
		
		
		
		
	}

}
