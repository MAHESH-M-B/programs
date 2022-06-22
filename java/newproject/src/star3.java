public class star3 
{
    public static void main(String a[])
    {
        int n=8;
        for(int i=1;i<n;i++)
        {
          for(int j=n;j>i;j--)
          {
              System.out.print(" ");
          }
          for(int k=1;k<i;k++)
          {
            System.out.print(" *");
          }
          System.out.println("\n");
        }

    }
}
