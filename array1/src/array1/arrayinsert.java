package array1;
import java.util.Scanner;
public class arrayinsert{
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
	System.out.println("enter the value you want to insert");
	int value=sc.nextInt();
	System.out.println("enter the position ");
	int pos =sc.nextInt();
	
	for(int j=n+1;j>=pos-1;j--)
	   {
	    a[j]=a[j-1];
	    }
	  n++;
	     a[pos-1]=value;

	for(int j=0;j<a.length;j++)
	{
		System.out.println(a[j]+" ");
	}
}
}
