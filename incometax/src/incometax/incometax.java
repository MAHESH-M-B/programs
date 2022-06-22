package incometax;
import java.util.Scanner;
public class incometax 
{
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your annual income");
	float income=sc.nextInt();
	if(income<250000)
	{
		System.out.println("no tax");
	}
	else if(income>=250000&&income<=500000)
	{
		float tax=(income*5)/100;
		System.out.println("tax is "+tax);
	}
	else if(income>500000&&income<=1000000)
	{
		float tax=(income*20)/100;
		System.out.println("tax is "+tax);
	}
	else if (income>1000000&&income<=5000000)
	{
		float tax=(income*30)/100;
		System.out.println("tax is "+tax);
	}
}
}
