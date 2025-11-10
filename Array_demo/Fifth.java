package Array_demo;

public class Fifth {

	private static int second;

	public static void main(String[] args) {
		int[]arr= {11,13,34,70,52,61,60,23,-34,454,23,23,-56,-100,232,434,342,323,43,2,43,42};
		int num=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		int fourth=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				second =num;
				num=arr[i];
			}
			if(arr[i]>second && arr[i]<num)
			{
				third =second;
				second=arr[i];
			}
			if(arr[i]>third && arr[i]<second)
			{
				fourth =third;
				third=arr[i];
			}
			if(arr[i]>fourth && arr[i]<third)
            {
				fourth=arr[i];
            }
		}
		System.out.println("Highest:"+num);
		System.out.println("second:"+second);
		System.out.println("third:"+third);
		System.out.println("fourth:"+fourth);
	}

}
