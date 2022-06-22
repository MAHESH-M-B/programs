public class numpattern2 
{
    public static void main(String ar[])
    {
        
        for(int i=1;i<=5;i++)
        {
            int a=1;
            for(int j=5;j>=i;j--)
            {
               System.out.print(a);
               a++;
            }
            System.out.println();
        }
    }
}
