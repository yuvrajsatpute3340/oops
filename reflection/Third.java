package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Third {

	public static void main(String[] args) throws Exception
	{
		
		//System.out.println(Employee.class);
		Class<?>cs=Class.forName("reflection.Employee");
		Field[]fields=cs.getDeclaredFields();
		Constructor<?>cs3=cs.getDeclaredConstructor(double.class);
		cs3.setAccessible(true);
		
		Employee emp=(Employee)cs3.newInstance(5648.89);
		for(Field f:fields)
		{
			System.out.println(f);
		}
		Field sal=cs.getDeclaredField("salary");
		Field email=cs.getDeclaredField("email");
		System.out.println("_______________-");
		System.out.println(sal);
		sal.setAccessible(true);
		email.set(emp,"yuvraj@1233gmail.com");
		System.out.println(sal.getDouble(emp));
		System.out.println(email.get(emp));

	}

}
class Employee
{
	private double salary;
	public String name;
	public String email;
	
	private Employee(double salary)
	{
		
	}
}
