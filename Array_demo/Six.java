package Array_demo;

public class Six {

	public static void main(String[] args) {
		int[]arr= {10,20,30,40,50,60,70,80,90,100};
		int num=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		int fourth=Integer.MIN_VALUE;
		int fifth=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				second=num;
				num=arr[i];
			}
			if(arr[i]>second && arr[i]<num)
			{
				third=second;
				second=arr[i];
			}
			if(arr[i]>third && arr[i]<second)
			{
				fourth=third;
				third=arr[i];
			}
			if(arr[i]>fourth && arr[i]<third)
			{
				fifth=fourth;
				fourth=arr[i];
			}
			if(arr[i]>fifth && arr[i]<fourth)
			{
				fifth=arr[i];
			}
		}
		System.out.println("Highest:"+num);
		System.out.println("second:"+second);
		System.out.println("third:"+third);
		System.out.println("fourth:"+fourth);
		System.out.println("fifth:"+fifth);
		
	}

}
