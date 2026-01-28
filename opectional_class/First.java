package opectional_class;

import java.util.Optional;

public class First {

	public static void main(String[] args) {

		//optional.of()
		Optional<String> opt = Optional.of("Java");//Optional[Java]
    	System.out.println(opt);
		
		//Optional.ofNullable()
		//Optional<String> opt = Optional.ofNullable(null);//Optional.empty     		 
		//System.out.println(opt);
		
		//Optional.empty()
		//Optional<String> opt = Optional.empty();//Optional.empty
		//System.out.println(opt);
	}

}
