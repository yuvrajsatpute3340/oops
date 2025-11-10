package Practic_Array;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=13;
		boolean isprime=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				isprime=true;
				break;
			}
		}
		System.out.println(isprime ? "Prime" : "Not Prime");
		}

}
