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
		Optional<String>ops=Optional.ofNullable("Yuvraj");//true
		System.out.println(ops.isPresent());//Optional[Yuvraj]
		System.out.println(ops);//YUVRAJ
		ops.ifPresent((i)->System.out.println(i.toUpperCase()));//Yuvraj
		ops.ifPresentOrElse(System.out::println,()->{System.out.println("nothing");});
		}

	}


