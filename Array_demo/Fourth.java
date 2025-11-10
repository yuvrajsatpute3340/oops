package Array_demo;

public class Fourth {

	public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6,7,8,9,10};
        int num=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
   for(int i=0;i<arr.length;i++) 
   {
	   if(arr[i]>num) 
	   {
		  second=num;
		  num=arr[i];
	 }
	   if(arr[i]>second &&arr[i]<num)
	   {
		  third=second;
		  second=arr[i];
	   }
 }
   
       System.out.println("Highest:"+num);
       System.out.println("second:"+second);
       System.out.println("third:"+third);
	}

}
