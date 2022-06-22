package arraynew;

public class arrymaj
{
public static void main(String ar[])
{
	int b[]=new int[100];
	int a[]= {1,2,1,2,1};
	int limit=5;
	
	for(int i=0;i<limit;i++)
	{
		 int count=1;
		 if(a[i]!=-1)
	       {
		for(int j=i+1;j<limit;j++)
		{
			
			  if(a[i]==a[j])
			  {
				count++;
				a[j]=-1;
			  }
		}
		   }
		 if(a[i]!=-1)
		 {
		  System.out.println("the element is "+a[i]+"count" +count);
		 }
		}

	
}   
}
