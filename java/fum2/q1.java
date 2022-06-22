import java.util.Scanner;

public class q1

{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int res=(num1<num2) ? (num1) :( num2 );
            res=(res<num3) ?(res) :(num3);
            System.out.println("the smallest is "+res);
    }
}