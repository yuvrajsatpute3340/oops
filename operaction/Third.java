package operaction;

import java.util.Comparator;
import java.util.List;

public class Third {

	public static void main(String[] args) {
		
		List.of(12,23,45,67,7,8,9,57,455,36)
		.stream()
		.sorted()
		.limit(2)
		.skip(1)
		.forEach((i)->{System.out.println(i);});
		
		long num=List.of(new Employee(1,"abc",4878),
				new Employee(2,"teu",8407),
				new Employee(3,"jjdl",7949),
				new Employee(4,"uif",5679))
				
				.stream()
				.sorted(new salarycomp())
				.limit(2)
				.count();
		
		System.out.println(num);		
	}
}
class Employee{
	 int id;
	 String name;
	 double salary;
	 
	 public Employee(int id,String name,double salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	 public String toString()
	 {
		 return this.name+"["+this.salary+"]";
	 }
}
class salarycomp implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return Double.compare(o2.salary,o1.salary); 
	}
	
}










