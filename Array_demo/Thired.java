package Array_demo;

public class Thired {

	public static void main(String[] args) {
		String[]arr3=new String[10000];
		for(int i=0;i<10000;i++)
		{
			arr3[i]=""+i;
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
	}

}
