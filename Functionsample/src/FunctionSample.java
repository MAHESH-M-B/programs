import java.util.Scanner;
public class FunctionSample {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result=sum(num1,num2);
		System.out.println("the resutlt is "+result);
	
	}


static int sum(int a,int b)
{
	int s=a+b;
	return s;
}
}