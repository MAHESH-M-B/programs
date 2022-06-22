import java.util.Scanner;
public class Prime {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int flag=0;
		for(int i=0;i<num;i++)
		{
		if(num%2==0)
		{
		 flag=1;
		 break;
		}
		}
		
		if(flag==0)
		{
			System.out.println("the number is prime");
		}
		else
		{
			System.out.println("the number is not prime");
		}
	}

}
