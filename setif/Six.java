package setif;

import java.time.LocalDateTime;

public class Six {

	public static void main(String[] args) {
		
		LocalDateTime date1=LocalDateTime.of(1999,2,21,13,13);
		LocalDateTime date2=LocalDateTime.of(2007,1,26,11,11);
		
		Carr mastang=new Carr(34.67,"fourd-mus",new LocalDateTime[] {date1,date2});
		
		System.out.println(mastang);
	}
}
class Carr
{
	double price;
	String name;
	LocalDateTime[] servicings;
	
	public Carr(double price,String name,LocalDateTime[] servicings)
	{
		this.price=price;
		this.name=name;
		this.servicings=servicings;
	}
}
