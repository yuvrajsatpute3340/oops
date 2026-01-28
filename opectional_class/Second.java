package opectional_class;

import java.util.Optional;

public class Second {

	public static void main(String[] args) {
		
		//isPresent()
		//Optional<String>ops=Optional.empty();
		//Optional<String>ops2=Optional.ofNullable("yuvi");
		//System.out.println(ops2.isPresent());//true
		//System.out.println(ops.isPresent());//false
		
		//get()
		//Optional<String>ops=Optional.ofNullable("yes");//yes
		//System.out.println(ops.get());
		
		//ifPresent()
		Optional<String>ops=Optional.ofNullable("Yuvraj");
		System.out.println(ops.isPresent());
		System.out.println(ops);
		ops.ifPresent((i)->System.out.println(i.toUpperCase()));
		ops.ifPresentOrElse(System.out::println,()->{System.out.println("nothing");});
		}

	}


