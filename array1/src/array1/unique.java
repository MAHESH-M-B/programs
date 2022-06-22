package array1;

public class unique 
{
public static void main(String ar[])
{
	int count=0 ;
	int k=0;
	int a[]= {1,2,3,4,1,2};
	for(int i=0;i<6;i++)
	{
		count=0;
		for(int j=0;j<6;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		if(count==1) 
		{
			k++;
		}
		
	}
	
	System.out.println("the count is "+k);
}
}
