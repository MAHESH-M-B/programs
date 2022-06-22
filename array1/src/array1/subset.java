package array1;

public class subset 
{
	public static void main(String ar[])
{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3};
	     int flag=0;
	for(int i=0;i<3;i++)
	{
		flag=0;
		for(int j=0;j<5;j++)
		{
			
			if(a[j]==b[i])
			{
				flag=1;
				break;
			}
		}
		
		
	}
	if(flag==0)
	   {
		System.out.println("it is not subset");
	
	   }
	else
		{
			System.out.println("it is subset ");
		}
		
	

}
}
