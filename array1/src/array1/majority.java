package array1;

public class majority 
{
public static void main(String ar[])
{
	int maj=0,count=0,value = 0;
	int a[]= {1,2,3,4,2,4,4,4};
	for(int i=0;i<a.length;i++)
	{
		count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		
		if(maj<count)
		{
			maj=count;
			value=a[i];
		}
		
		
		
	}
	}
		
	System.out.println("the element is "+value+"count is "+maj);
	
}
}
