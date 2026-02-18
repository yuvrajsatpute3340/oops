package copying;

public class First {

	public static void main(String[] args) {
	
		Student stud =new Student();
		
		stud.id=30;
		stud.name="i20";
		
		Student two=stud;
		System.out.println(two==stud);
		
		two.name="i10";
		System.out.println(stud.name);
		System.out.println(stud.id);
		

	}

}
class Student 
{
	int id;
	String name;
}
