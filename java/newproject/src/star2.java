public class star2 
{
    public static void main(String a[])
    {
        int   n=5;
        for(int i=1;i<5;i++)
        {
        for(int j=n;j>i;j--)
        {
            System.out.print(" *");

        }
        System.out.println();
        for(int k=1;k<=i;k++)
        {
            System.out.print(" ");
        }

        }
      
    }
}
