package part7;
import java.util.Scanner;
public class functionsample 
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result=sum(num1,num2);
        System.out.println(result);
    }
    static int sum(int a,int b)
    {
        int s=a+b;
        return s;
    }

    
}
