package multihreading;

public class First {

	public static void main(String[] args) {
		
		int count =1;
		while(count<100) {
			System.out.println("Hello");
		}
		NumberPrinter number=new NumberPrinter();
		number.run();
	}

}
class NumberPrinter extends Thread
{

	@Override
	public void run() {
		System.out.println("Hello runnable...");
	}
	
}

	

