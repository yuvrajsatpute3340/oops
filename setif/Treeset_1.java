package setif;

import java.util.TreeSet;

public class Treeset_1 {

	public static void main(String[] args) {
		Student one=new Student(34,"ABC");
		Student two=new Student(44,"DEF");
		
		TreeSet<Student>tree=new TreeSet<Student>();
		
		tree.add(one);
		tree.add(two);
		
		System.out.println(tree);
	}
}
class Student implements Comparable<Student>
{
	int mark;
	String name;
	
	public Student(int mark,String name)
	{
		this.mark=mark;
		this.name=name;
	}
	public String toString()
	{
		return this.name+" "+this.mark;
	}
	@Override
	public int compareTo(Student o) {
		System.out.println("Calling the comparable to position");
		return o.name.compareTo(this.name);
	}
}
