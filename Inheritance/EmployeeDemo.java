package Inheritance;

import java.util.Scanner;

//import com.yuvi.inheritance.Designer;
//import com.yuvi.inheritance.Developer;

public class EmployeeDemo {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Developer Salary :");
		double devSalary=sc.nextDouble();
		Developer developer1=new Developer(devSalary);
		
		
		System.out.println("Enter Designer Salary :");
		double desSalary=sc.nextDouble();
		Designer designer=new Designer(desSalary);
		System.out.println(developer1);
		System.out.println(designer);
		sc.close();
	}

}
