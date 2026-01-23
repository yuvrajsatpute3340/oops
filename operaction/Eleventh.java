package operaction;

import java.util.List;

public class Eleventh {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("hello");

        List.of("eiei", "dgkj", "cjd", "dhc")
            .stream()
            .map(sb::append)
            .forEach(i -> {
                System.out.println(sb == i); 
                System.out.println(sb);
		});
	}

}
