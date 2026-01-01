package Polymorphism;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class Poly_1 {

	public static void main(String[] args) {
		
		Parent para=new Child();
		para.read();
	}
}
class Parent
{
	public void read()
	{
		System.out.println("I am reading the old novels:");
	}
}
class Child extends Parent
{
	public void read()
	{
		System.out.println("I am reading the superman comic....");
	}
}