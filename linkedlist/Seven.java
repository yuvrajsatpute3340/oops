package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Seven {

	public static void main(String[] args) {
		
		ArrayList<Book>book= new ArrayList<Book>();
		
		for(int i=0;i<10000;i++)
		{
			book.add(new Book(i,"A",34.67,3.5));
		}
		long start_time=System.nanoTime();
		System.out.println(book.remove(1));
		long end_time=System.nanoTime();
		System.out.println("time taken:"+(end_time-start_time)/1000);		
	}
}
class Book 
{
	int id;
	String name;
	double price;
	double rating;
	
	public Book (int id,String name,double price,double rating)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.rating=rating;
		
	}
}
