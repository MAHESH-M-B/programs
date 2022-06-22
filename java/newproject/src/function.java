import java.util.Scanner;
public class function
{
    Scanner sc=new Scanner(System.in);
    void getArray(int size,int array[][])
    {
        System.out.println("enter array values");
         for(int i=0;i<size;i++)
         {
             for(int j=0;j<size;j++)
             {
                array[i][j]=sc.nextInt();
             }
             System.out.println();
         }
         
    }


    void displayarray(int size,int array[][])
    {
        System.out.println("the array is");
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                 System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}