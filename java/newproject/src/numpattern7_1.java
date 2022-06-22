public class numpattern7_1
 {
    public static void main(String ar[])
    {
        int a=1;
        int b=4;
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(a);
                 
                  if(k==a)
                  {
                    System.out.printf(" ");
                  }
                  else
                  {
                      System.out.print("*");
                  }
                
            }
            System.out.println();
            a++;
        }
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(b);
                if(j==i)
                {
                
                System.out.print("");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
            b--;
        }
    }
}
