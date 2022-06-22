package arraynew;
import java.util.Scanner;
public class arrayreverse 
{
	Scanner sc=new Scanner(System.in);
   public static void main(String ar[])
   {
	   int a[]= {1,2,3,4,5};
	  int limit=5;	   
		   for(int j=0;j<limit/2;j++)
		   {
			   int temp=a[j];
			   a[j]=a[limit-j-1];
			   a[limit-j-1]=temp;
		   }
	   for(int j=0;j<limit;j++)
	   {
		   System.out.println(a[j]);
	   }
   }
}
