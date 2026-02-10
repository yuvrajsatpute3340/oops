package listif;

import java.util.ArrayList;
import java.util.List;

public class Demo_3 {

	public static void main(String[] args) {
		
		List<Student2>list=new ArrayList<Student2>();
		
		Student2 st = new Student2 ();
		st.email="ABC@gmail.com";
		st.id=1;
		st.name="ABC";
		
		Student2 st2 = new Student2 ();
		st2.email="abc@gamil.com";
		st2.id=2;
		st2.name="abc";
		
		list.add(st2);
		list.add(st);
		//list.addFirst(st);
		System.out.println(list);
		
		//list.set(0, st2);
		
//		Student2 st3 = new Student2 ();
//		st3.email="DEF@gmail.com";
//		st3.id=3;
//		st3.name="DEF";
//		
//		list.add(st3);
//		
//		list.set(1, st3);
//		list.addFirst(st);
//		System.out.println(list);
		
		
		

	}
}
class Student2
{
	int id;
	String name;
	String email;
	
	public String toString() {
		return this.id+" "+this.name;
		
	}
}
