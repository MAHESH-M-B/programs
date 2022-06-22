public class numpattern5_1 
{
    public static void main(String ar[])
    {
        for(int i=1;i<=5;i++)
        {
            int a=1;
             for(int j=5;j>=i;j--)
             {
                System.out.print(" ");
             }
             for(int k=1;k<=i;k++)
             {
                 if(k==1||i==5||k==i)
                 {
                 System.out.print(" "+a);
                 
                 }
                 
                 else{
                     System.out.print("  ");
                 }
                 a++;
             }
             System.out.println();
        }
    }
}
