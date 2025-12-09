package vector;

import java.util.Vector;

public class Second {

	public static void main(String[] args) {
		
        Vector<String> v = new Vector<>();
        Vector<Integer> v1 = new Vector<>();
        
        v.add("unique");
        v.add("System");
        v.add("pvt ltd");
        v.add("India");
        
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        
        System.out.println(v.add("India"));
        System.out.println(v1.add(10));
        System.out.println(v.indexOf(v1));
        System.out.println(v1.isEmpty());

	}

}
