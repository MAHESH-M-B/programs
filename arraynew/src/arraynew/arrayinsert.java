package arraynew;
import java.util.Scanner;
public class arrayinsert
{
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int a[]= {1,2,3,4,5,};
	int n=6;
	System.out.println("enter the value to insert");
	int  value=sc.nextInt();
    System.out.println("enter the position to insert");
    int pos=sc.nextInt();
    for(int i=n+1;i>=pos-1;i--)
	   {
	    a[i]=a[i-1];
	    }
	  n++;
	   a[pos-1]=value;

    for(int i=0;i<a.length;i++)
    {
    	System.out.println(a[i]);
    }
}
}
