public class numpattern4_1 
{
    public static void main(String ar[])
    {
        int a=8;
        for(int i=1;i<=8;i++)
        {
            for(int j=a;j>i;j--)
            {
              System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
