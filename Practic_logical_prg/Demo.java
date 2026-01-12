package Practic_logical_prg;

import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {

	public static void main(String[] args) {
		
		//Function<String,StringBuffer>fun=(t)->{return new StringBuffer(t);};
		//System.out.println(fun.apply("Yuvraj").reverse());//jarvuy
		
		//Function<Integer,Integer>fun1=(t)->{return new Integer(t);};
		//System.out.println(fun1.apply(500).equals(200));//false
		
	     //Function<String,String>fun2=(t)->{return new String(t);};
	     //System.out.println(fun2.apply("yidk").equals(fun2));
		
		Supplier<String>sup1=()->{return new String("yuvi");};
		System.out.println(sup1.get().length());
	}

}
