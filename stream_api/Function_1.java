package stream_api;

import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {
		
		Function<String,Integer>fun=(i)->{
			System.out.println("String to Integer....");
			return i.length();
		};
		Function<Character[],String>fun2=(i)->{
			System.out.println("First Array to String...");
			String s=new String();
			for (char c:i)
			{
				s=s+c;
			}
			return s;
		};
		Function<Character[],Integer>fun3=fun.compose(fun2);
		System.out.println(fun3.apply(new Character[] {'a','b','c'}));
	}

}
