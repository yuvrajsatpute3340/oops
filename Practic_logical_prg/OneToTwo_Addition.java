package Practic_logical_prg;

public class OneToTwo_Addition {

	public static void main(String[] args) {
		
//		int n=100;
//		int sum=n * (n+1)/2;//Without loop 
//		
//		System.out.println("Sum Of Number From 1 To 100 Is : "+sum);
		
		
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum = sum + i;//for loop use 
		}
		System.out.println("Sum Of Number 1 To 100 Is : "+sum);
	}

}
