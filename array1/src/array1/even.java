package array1;

public class even 
{
   public static void main(String ar[])
   {
	   int a[]= {1,2,3,4,5};
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]%2==0)
		  {
			  a[i]=-1;
		  }
	  }
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]!=-1)
		  {
			  System.out.println(a[i]);
		  }
	  }
   }
}
