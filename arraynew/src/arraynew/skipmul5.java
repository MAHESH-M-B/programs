package arraynew;
import java.util.Scanner;
public class skipmul5
{
  public static void main(String ar[])
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		 int s=sc.nextInt();
		int a[]=new int[20];
	    System.out.println("enter the values of the array");
	    for(int i=0;i<s;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	  for(int i=0;i<s;i++)
	  {
		  if(a[i]%5==0)
		  {
			  for(int j=i;j<s;j++)
			  {
				  a[j+1]=a[j+3];
			  }
			  s=s-2;
		  }
		  
	  }
	  for(int i=0;i<s;i++)
	  {
		  System.out.println(a[i]);
	  }
  }
}
