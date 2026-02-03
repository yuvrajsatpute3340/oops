package multihreading;

public class Third {

	public static void main(String[] args) {
		int count =1;
		while(count<5) {
			System.out.println("Yuvi");
			count++;
		}
		NumberPrinter number=new NumberPrinter();
		
	}

}
class NumberPrinter1 extends Thread
{

	@Override
	public void run() {
		System.out.println("Hello runnable...");
	}

}
