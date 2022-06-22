package arraynew;
import java.util.Scanner;
public class arraydel 
{
    public static void main(String ar[])
    {
    	Scanner sc=new Scanner(System.in);
    	int a[]= {1,2,3,4,5};
    	int limit=5;
    	System.out.println("enter the position  to delete");
    	int pos=sc.nextInt();
    	for(int i=pos-1;i<limit;i++)
    	{
    		a[i]=a[i+1];
    	}
    	limit--;
    	for(int i=0;i<limit;i++)
    	{
    		System.out.println(a[i]);
    	}
    }
}
