package array1;
import java.util.Scanner;
public class arraydesc {
	public static void main(String ar[])
	{
		Scanner Sc=new Scanner(System.in);
		int a[]=new int[100];
		int b[]=new int [100];
		int i;
		System.out.println("enter the size");
		int s=Sc.nextInt();
		System.out.println("enter the values");
		for( i=0;i<s;i++)
		{
			a[i]=Sc.nextInt();
		}
		for(i=0;i<s;i++)
		{
		   for(int j=i+1;j<s;j++)
		   {
			   if(a[i]>a[j])
			   {
				   int temp=a[i];
				   a[i]=a[j];
				   a[j]=temp;
			   }
		   }
		   
		}
		System.out.println("the second largest element is");
			  System.out.println(a[i-2]);
	}

}
