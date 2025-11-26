package contract;

public class Six {

	public static void main(String[] args) {
		Book first=new Book(1,"ABC",67.89);
		Book Second=new Book(1,"ABC",67.89);
		Book third=new Book(1,"ABC",67.89);
		
		/**
		 * Reflexive
		 */
		System.out.println(first.equals(first));
		System.out.println(first.equals(Second));
		
		/**
		 * Symmetric
		 */
		System.out.println(first.equals(Second));
		System.out.println(first.equals(first));
		
		/**
		 * Transitive
		 */
		System.out.println("*******************************");
		System.out.println(first.equals(Second));
		System.out.println(first.equals(third));
		System.out.println(first.equals(third));
		
		/**
		 * Consistent
		 */
		System.out.println("*******************************");
		System.out.println(first.equals(Second));
	}
}
class Book
{
	int id;
	String name;
	double price;
	
	public Book(int id,String name,double price)
	{
		this.name=name;
		this.id=id;
		this.price=price;
		
	}
	public boolean equals(Object obj)
	{
		Book another=(Book)obj;
		return this.id==another.id && this.name.equals(another.name)&&this.price==another.price;
	}
}
