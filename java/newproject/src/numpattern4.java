public class numpattern4 
{
    public static void main(String ar[])
    {
     int a=1; 
     for(int i=1;i<=5;i++)
     {
         for(int j=4;j>=i;j--)
         {
             System.out.print(" ");
         }
         for(int k=1;k<=i;k++)
        {
            System.out.print("*");
        }
        a=a+2;
        for(int l=4;l>=i;l--)
        {
            System.out.print(" ");
        }
        System.out.println();
     }  

    }
}
