package Abstraction;

public class Fourth {

	public static void main(String[] args) {
		Study stud =new Study()
				{

		@Override
		public void dostudy(String str) {
			System.out.println("Hello");
			}

		@Override
		public void visit() {
			System.out.println("I am visit the person");
		}	
	};
	stud.dostudy("srk");
	stud.visit();

	}

}
abstract class Study
{
	int i=23;
	public abstract void dostudy(String str);
	public void dorest()
	{
		System.out.println("Rest for same time ");
	}
	abstract public void visit();
}
class JavaStudent extends Study
{

	@Override
	public void dostudy(String str) {
		System.out.println("I am Studying :"+str);
	}
	public void noStudy()
	{
		
	}
	@Override
	public void visit() {
		// TODO Auto-generated method stub
		
	}
	
}
