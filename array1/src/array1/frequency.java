package array1;
import java.util.Scanner;
public class frequency 
{
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the array size");
	 int s=sc.nextInt();
	int a[]=new int[s];
	int b[]=new int[s];
    System.out.println("enter the values of the array");
    for(int i=0;i<s;i++)
    {
    	a[i]=sc.nextInt();
    }
    
     for(int i=0;i<s;i++)
     {
    	 int count=1;
    	 for(int j=i+1;j<s;j++)
    	 {
    		 if(a[j]==a[i])
    		 {
    			 a[j]=-1;
    			b[i]=count++;
    		 }
    		 
    	 }
     }
    for(int i=0;i<s;i++)
    {
    	if(a[i]!=-1)
    	{
    		System.out.println("number"+a[i]+"count"+b[i]);
    	}
    }
}
}
