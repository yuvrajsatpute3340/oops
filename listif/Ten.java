package listif;

import java.util.ArrayList;
import java.util.List;

public class Ten {

	public static void main(String[] args) {
		
		List<Student>list=new ArrayList<Student>();
		
		Student st=new Student();
		st.id=1;
		st.name="ABC";
		st.email="ABC@Gmial.com";
		
		Student st2=new Student();
		st2.id=2;
		st2.name="DEF";
		st2.email="DEF@Gmail.com";
		
		list.add(st2);
		list.add(st);
		
		Student st3=new Student();
		st3.id=3;
		st3.name="GHI";
		
		System.out.println(list);
		System.out.println("String :"+list.set(0, st3));
		System.out.println(list);
		System.out.println(list.reversed());
	
	}
}
class Student 
{
	int id;
	String name;
	String email;
	
	public String toString()
	{
		return this.id+""+this.name;
	}

		
}
