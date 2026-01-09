package String_API;

import java.util.function.Consumer;

public class cosumer_1 {

	public static void main(String[] args) {
		
		Consumer<Integer>demo=(t)->{System.out.println(t*4);};
		demo.accept(25);
	}

}
