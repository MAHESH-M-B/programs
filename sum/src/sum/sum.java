package sum;
import java.util.Scanner;
public class sum {
	Scanner sc=new Scanner(System.in);
	int a;
	int b;
	int c;
	int  calculate(int a, int b) 
	{
		c=a+b;
		return c;
	}
	void display()
	{
		int sum1=calculate(a,b);
		System.out.println(sum1);
		
	}

}
