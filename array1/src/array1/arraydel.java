package array1;
import java.util.Scanner;
public class arraydel
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the array values");
       for(int i=0;i<a.length;i++)
        {
	a[i]=sc.nextInt();
        }
 System.out.println("enter the position you want to delete");
 int pos=sc.nextInt();

	 for(int j=pos-1;j<a.length-1;j++)
	 {
	 a[j]=a[j+1];
	 }	


 System.out.println("the array is ");
 for(int i=0;i<a.length-1;i++)
 {
	 System.out.println(a[i]);
 }
}
}
