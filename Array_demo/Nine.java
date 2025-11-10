package Array_demo;

public class Nine {

	public static void main(String[] args) {
		int no=0;
		int[][] arr=new int[10][10];
		int counter=1;
		for(int i=0;i<arr.length;i++)
		{
			
			
			for(int j=0;j<arr[i].length;j++)
			{
				if(counter == 1)
				{
					arr[i][j]=0;
					
				}
				counter++;
				if(counter>1)
				{
					boolean flag=true;
					for(int k=2;k<counter;k++)
					{
						if(counter%k==0)
						{
							flag=false;
						}
						
					}
					if(!flag)
					{
						arr[i][j]=0;
						
				      }
					else
					{
						arr[i][j]=counter;
						no++;
					}
				}
			}

		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Total Prime nums:"+no);
		
	}

}
