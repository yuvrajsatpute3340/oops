package Collection_demo;

import java.util.Objects;

public class Imp2 {

	public static void main(String[] args) {
		Tree mango=new Tree("Indica",34.56);
		Tree apple=new Tree("Indica",34.56);
		
		System.out.println(mango.equals(apple));
		
		System.out.println(mango.hashcode());
		System.out.println(apple.hashCode());

		
	}
}
class Tree

{
	String name;
	double price;
	  
	public Tree(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
//	public boolean equals(Object obj)
//	{
//		Tree tree=(Tree)obj;
//		return this.equals(tree.name)&& this.price==tree.price;
//	}
	public int hashcode()
	{
		return Objects.hash(price,name);
	}
}
