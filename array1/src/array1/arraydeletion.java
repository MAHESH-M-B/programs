package array1;
import java.util.Scanner;
public class arraydeletion
{
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("enter the array size");
	int s=sc.nextInt();
	System.out.println("enter the values of the array");
	for(int i=0;i<s;i++)
	{
	   a[i]=sc.nextInt();	
	}
	
		for(int i=0;i<s;i++)
		{
			if(a[i]!=-1)
			{
			for(int j=i+1;j<s;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
		    }
			}
		}
		System.out.println("the array is ");
		for(int i=0;i<s;i++)
		{
		   if(a[i]!= -1)
		   {
			   System.out.println(a[i]);
		   }
		}
}
	
}
