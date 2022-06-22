public class numpattern1_1 
{
    public static void main(String ar[])
    {
        
        
        
        for(int i=0;i<5;i++)
        {  int a=i+1;
            for(int j=5;j>i;j--)
            {
                if(i==0||j==i+1||j==5)
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
