package contract;

public class Fifth {

	public static void main(String[] args) {
		Student7 st=new Student7(1,"ABC");
		Student7 st2=new Student7(2,"ABC");
		
		System.out.println(st.equals(st2));
	}
}
class Student7{
	int id;
	String name;
	
	public Student7(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public boolean equals(Object obj)
	{
		Student7 stud=(Student7)obj;
		return this.id==stud.id && this.name.equals(stud.name);
	}
}
