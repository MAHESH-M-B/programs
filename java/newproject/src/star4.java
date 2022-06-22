public class star4 {
    public static void main(String ar[])
    {
        int a=10;
        for(int i=1;i<a;i++)
        {
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        for(int l=1;l<=a;l++)
        {
            for(int m=a;m>=l;m--)
            {
                 System.out.print("*");
            }
            System.out.println();
            for(int n=1;n<=l;n++)
            {
                System.out.print(" ");
            }
              
        }
    }
    
}
