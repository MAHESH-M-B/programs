package array1;
import java.util.Scanner;
public class reverse
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
	  int n=sc.nextInt();
	  System.out.println("enter the values of the array");
	  int a[]=new int[100];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=sc.nextInt();
	  }
	for(int j=0;j<n/2;j++)
	  {
		int temp=a[j];
		a[j]=a[n-j-1];
		a[n-j-1]=temp;
	   }
	System.out.println("the reversed array is");
	for(int j=0;j<n;j++)
	{
	    System.out.println(a[j]);	
	}
  }
		
}


