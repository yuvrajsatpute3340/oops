package setif;

import java.util.Comparator;
import java.util.TreeSet;

public class Employee_Set {

	public static void main(String[] args) {
		
		TreeSet<Employee> Set=new TreeSet<Employee>(new SalaryComparetor());
		
		Set.add(new Employee(123456.56,"IT","JOHN"));
		Set.add(new Employee(123457.56,"HR","JOHNY"));
		Set.add(new Employee(123458.56,"ACC","JOHNASSSON"));
		Set.add(new Employee(123459.56,"MRR","JOH"));
		
		System.out.println(Set);

		
	}
}
class Employee
{
	double salary;
	String dept;
	String name;
	public Employee(double salary, String dept,String name) 
	{
		super();
		this.salary=salary;
		this.dept=dept;
		this.name=name;
	}
	public String toString()
	{
		return this.dept+" "+this.salary+" "+this.name;
	}
}
class SalaryComparetor implements Comparator<Employee>
{
	public int compare(Employee o1,Employee o2)
	{
		return Double.compare(o1.salary,o2.salary);
	}
}
