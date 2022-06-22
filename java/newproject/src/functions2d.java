import java.util.Scanner;
public class functions2d
 {
    Scanner sc=new Scanner(System.in);
    void getarray()
    {
        System.out.println("enter the array size");
        int size=sc.nextInt();
        System.out.println("enter the array values");
        for( int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
             array1[i][j]=sc.nextInt();
            }
        }

    }
    void addarray()
    {
        int size;
        for( int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                sum[i][j]=array[i][j]+array[i][j];            }
        }
    }
    void displayarray()
        {
          for(int i=0;i<size;i++)
          {
              for(int j=0;j<size;j++)
              {
                  System.out.println(sum[i][j]);
              }
          }
        }

    
}
