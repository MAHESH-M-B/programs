public class numpattern3_1
 {
    public static void main(String a[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1|| i==5 ||i==j)
                {
                    System.out.print("* ");
                }
                else
                {
                   System.out.print("  ");
                }
            }
            System.out.println(""); 
        }
    }
}
