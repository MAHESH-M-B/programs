package arrayadjmultiply;
import java.util.Scanner;
public class adjmul {
	public static void main(String a[])
	{
    Scanner sc=new Scanner(System.in);
	System.out.println("enter array limit");
	int limit=sc.nextInt();
	System.out.println("enter array values");
	int value[]=new int[100];
	int mulvalue[]=new int[100];
	for(int i=0;i<limit;i++)
	  {
	  value[i]=sc.nextInt();
	  }
	for(int i=0;i<limit-1;i++)
	{
       mulvalue[i]=value[i]*value[i+1];
	}
	for( int i=0;i<limit-1;i++) 
	{	
		System.out.print(" "+mulvalue[i]);

	}
		}
	
}
