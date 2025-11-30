package generics;

public class Six {

    public static void main(String[] args) {

        code<String, Integer> cod = new Phone();
        Demo<String, Integer> dem = new Mobile();
        program<String,Integer>pro = new Book();
        laptop<String,Integer>lap = new Home();
        
        System.out.println(cod.code("Unique"));  
        System.out.println(dem.Demo("System"));   
        System.out.println(pro.progarm("Pvt.Ltd"));
        System.out.println(lap.laptop("India"));
    }
}

interface code<x, y> {
    y code(x x1);
}

class Phone implements code<String, Integer> {
    public Integer code(String x1) {
        return x1.length();
    }
}

interface Demo<a, b> {
    b Demo(a a1);
}

class Mobile implements Demo<String, Integer> {
    public Integer Demo(String a1) {
        return a1.length();
    }
}
interface program<c,d>
{
	d progarm(c c1);
}
class Book implements program<String,Integer>
{
	public Integer progarm(String c1)
	{
		return c1.length();
	}
}
interface laptop<e,f>
{
	f laptop(e e1);
}
class Home implements laptop<String,Integer>
{
	public Integer laptop(String e1)
	{
		return e1.length();
	}
}
