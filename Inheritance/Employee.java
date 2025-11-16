package Inheritance;

//import com.yuvi.inheritance.Employee;

public class Employee {
	protected double employeeSalary;
	public Employee(double employeeSalary)
	{
		super();
		this.employeeSalary=employeeSalary;
	}

}
class Developer extends Employee
{
	public Developer(double developerSalary) {
		super(developerSalary);
	
	}
	
	@Override
	public String toString() {
		return "Developer [employeeSalary=" + employeeSalary + "]";
	}	
	}
class Designer extends Employee
{
	public Designer(double designerSalary)
	{
		super(designerSalary);
	}

	@Override
	public String toString() {
		return "Designer [employeeSalary=" + employeeSalary + "]";
	}
	}


