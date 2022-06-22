package array1;
import java.util.Scanner;
public class array 
{
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[100];
	System.out.println("enter the array size");
	int size=sc.nextInt();
	System.out.println("enter the values of the array");
	for(int i=0;i<size;i++)
	{
	  a[i]=sc.nextInt();
	}
	System.out.println("the array is");
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);	}
}
}
