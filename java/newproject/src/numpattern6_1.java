public class numpattern6_1 
{
    public static void main(String ar[])
    {
        int a=3;
        int b=5;
        for(int i=1;i<=4;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
               System.out.print(a);
            }
            System.out.println();
            a++;
        }
        for(int i=1;i<=4;i++)
        {
           
            for(int j=3;j>=i;j--)
            {
                System.out.print(b);
            }
            System.out.println();
            b--;
        }
    }
}
