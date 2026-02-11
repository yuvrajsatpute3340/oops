package hashSet;

import java.util.HashSet;

public class First {

	public static void main(String[] args) {
		
		HashSet<Book> set =new HashSet<>();
		
//		set.add(10);
//		set.add(20);
//		set.add(10);
//		set.add(20);
//		set.add(null);
//		set.add(null);
//		
//		System.out.println(set);
		
		Book b1=new Book(1,700);
		Book b2=new Book(2,800);
		Book b3=new Book(3,900);
		Book b4=new Book(4,1000);
		Book b5=new Book(1,700);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		System.out.println("b1:"+b1.hashCode());
		System.out.println("b5:"+b5.hashCode());
		System.out.println(b1.equals(b5));
		System.out.println(set);
		
		//System.out.println(b1.equals(b5));
		//System.out.println(set);
		
		

	}
}
class Book
{
	int id;
	double price;
	
	public Book(int id,double price)
	{
		this.id=id;
		this.price=price;
	}
	public String toString()
	{
		return "{"+this.id+" "+this.price+"}";
	}
	public int hashcode()
	{
		return this.id+(int)this.price;
	}
}
