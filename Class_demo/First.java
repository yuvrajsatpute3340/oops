package Class_demo;

public class First {

	public static void main(String[] args) {
		int age=20;
		char chars='C';
		double id=1234567.545;
		
		Second saheel=new Second();
		    saheel.age=20;
		    saheel.chars='C';
		    saheel.id=1234567.545;
		    
		    System.out.println(saheel.age);
		    System.out.println(saheel.chars);
		    System.out.println(saheel.id);
		    System.out.println("**********");
		    
		 Second sameer=new Second();
		     sameer.age=21;
		     sameer.chars='A';
		     sameer.id=123.5;
	             
		     System.out.println(sameer.age);
		     System.out.println(sameer.chars);
		     System.out.println(sameer.id);
		  
		 //Third saheel=new saheel(); 
		// saheel.id=234;
	}

}
class Second
{
	int age;
	char chars;
    double id;
}
