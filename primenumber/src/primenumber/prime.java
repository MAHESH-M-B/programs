package primenumber;
import java.util.Scanner;
public class prime {
	public static void main(String ar[])
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limit");
		int l=sc.nextInt();
		int a[]=new int[100];
		for(int i=1;i<=l;i++)
		{
			if(i%2==0)
			{
				flag=1;
				continue;
			}
			if(flag==0)
			{
			for(int j=1;j<=l;j++)
			{
				a[i]=i;
			}
			}
			System.out.println(a[i]);	
		}
		
		
	}

}
