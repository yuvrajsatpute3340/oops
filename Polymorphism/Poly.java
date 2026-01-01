package Polymorphism;

public class Poly {

	public static void main(String[] args) {
		
		Calculator1 cals=new Calculator1();
		cals.add(12,33,56);
	}
}
class Calculator1
{
	public Calculator1()
	{
		
	}
	public Calculator1(int i)
	{
		
	}
	public void add(int i,int j)
	{
		System.out.println(i+j);
	}
	public int add(int i, int j,int k)
	{
		return i+j+k;
	}
	public void add(double d,double d2)
	{
		System.out.println(d+d2);
	}
}