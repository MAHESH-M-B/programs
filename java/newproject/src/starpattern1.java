public class starpattern1 
{
    public static void main(String ar[])
    {
        int a=5,b=5,c=1;
        for(int i=1
        ;i<=a;i++)
        {
            for(int j=b;j>=i;j--)
            {
               System.out.print("*");
            }
              b--;
              System.out.println("");
              for(int k=c;k<=i;k++)
              {
                 System.out.print(" ");
              }
              c++;
        }
    }
}
