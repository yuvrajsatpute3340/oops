package Abstraction;

public class Third {

	public static void main(String[] args) {
		Ianimal ian=new tiger();
		Idrink idn=new tiger();
		
		tiger shera=new tiger();
	}
} 
interface Ianimal 
{
	int id=123;
	 void sleep(int i);
	 void sleep(int i,int j);
	 void jump(String str);
	 void hunt(String str);
}
interface Idrink
{
	int drink(String str);
}
class tiger implements Ianimal,Idrink
{

	@Override
	public void sleep(int i) {
		System.out.println(Ianimal.id);	
		}

	@Override
	public void sleep(int i,int j) {
		
	}

	@Override
	public void jump(String str) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hunt(String str) {		
	}

	@Override
	public int drink(String str) {
		return 0;
	}
	
}
