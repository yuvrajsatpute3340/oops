package Constructors;

public class First {

	public static void main(String[] args) {
		Book book=new Book(200);
		book.display();
	}

}
class Book
{
	double pri;
	public Book (double price)
	{
		pri=price;
		System.out.println(price);
		System.out.println("Good Morning!.....");
		}
	public Book()
	{
		System.out.println("Non param....");
	}
	public Book(char c,char d,int i)
	{
		System.out.println(c+"..."+d+i);
	}
	public void display()
	{
		System.out.println("The price of the book:"+pri);
	}
}
