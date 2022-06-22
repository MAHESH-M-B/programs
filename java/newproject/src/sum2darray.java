import java.util.Scanner;
public class sum2darray 
{
public static void main(String a[])
    {
      Scanner sc =new Scanner(System.in);
       System.out.println("enter the array size");
       int size=sc.nextInt();
       int array1[][]=new int[100][100];
       int array2[][]=new int[100][100];
       int    sum[][]=new int[100][100];
       getarray(size,array1,array2);
       sumarray(size,array1,array2,sum);
       displayarray(size,sum);
    }
    


static void getarray(int size,int array1[][],int array2[][])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the first array values");
     for(int i=0;i<size;i++)
        {
           for(int j=0;j<size;j++)
             {
                array1[i][j]=sc.nextInt();
             }
        }
System.out.println("enter the second array values");
    for(int i=0;i<size;i++)
       {
          for(int j=0;j<size;j++)
          {
              array2[i][j]=sc.nextInt();
          }
        }
          
       }


 static void sumarray(int size,int array1[][],int array2[][],int sum[][])
{
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
             sum[i][j]=array1[i][j]+array2[i][j];
        }
        
    }
} 


static void displayarray(int size,int sum[][])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("the sum is");
       for(int i=0;i<size;i++)
       {
           for(int j=0;j<size;j++)
           {
               System.out.println(sum[i][j]);
           }
       }
    }
    
}