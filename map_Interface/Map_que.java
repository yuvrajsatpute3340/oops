package map_Interface;

import java.util.HashMap;
import java.util.Objects;

public class Map_que {

	public static void main(String[] args) {
		
		Person per=new Person("ABC",12);
		Person per2=new Person("CDE",12);
		Person per3=new Person("EFG",13);
		
		System.out.println(per.hashCode());
		System.out.println(per2.hashCode());
		
		HashMap<Person,Integer>map=new HashMap<Person,Integer>();
		
		map.put(per,1);
		map.put(per2,2);
		map.put(per3,4);
		
		System.out.println(map);
	}
}
class Person 
{
	String name;
	double salary;
	public Person(String name,double salary)
	{
		super();
		this.name=name;
		this.salary=salary;
	}
	public int hashCode()
	{
		return Objects.hash(this.name,this.salary);
	}
	public String toString() {
		return this.name+" "+this.salary;
	}
}
