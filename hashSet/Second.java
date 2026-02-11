package hashSet;

import java.util.HashSet;

public class Second {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		String str="abc";
		String str2=new String("abc");
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str.equals(str2));
		
		set.add(str);
		set.add(str2);
		
		System.out.println(set);

	}

}
