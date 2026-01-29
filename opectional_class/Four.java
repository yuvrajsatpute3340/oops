package opectional_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Four {

	public static void main(String[] args) {

		Optional<Integer>op=List.of(12,346,8980,909,6787).stream()
				.min((i,j)->Integer.compare(i, j));
		System.out.println(op.get());
		List<Integer>list=new ArrayList<Integer>();
		list.add(49);
		list.add(85);
		 
		Optional<Integer>sum=list.stream()
				.reduce((i,j)->(i+j));
		sum.ifPresentOrElse(System.out::println,()->{System.out.println("Empty list");});
		
		
	}

}
