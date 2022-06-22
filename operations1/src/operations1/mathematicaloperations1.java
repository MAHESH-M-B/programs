package operations1;
import java.util.Scanner;
public class mathematicaloperations1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("1,addition 2,substraction 3,multiplication 4,division enter your choice" );
		int choice=sc.nextInt();
		operations op=new operations();
		switch(choice)
		{
		case 1:
			op.addition(a, b);
		break;
		case 2:
			op.substraction(a,b);
		break;
		case 3:
			op.mutltiplication(a,b);
		break;
		case 4:
			op.division(a, b);
		break;
		default:
			System.out.println("invalid entry");
		}
		
		
		
	}
}

class operations
{
	void addition(int num1,int num2)
	{
		System.out.println(num1+num2);
	}
	void substraction(int num1,int num2)
	{
		System.out.println(num1-num2);
	}
	void mutltiplication(int num1,int num2)
	{
		System.out.println(num1*num2);
	}
	void division(float num1,float num2)
	{
		System.out.println(num1/num2);
	}
}
