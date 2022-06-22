import java.util.Scanner;
public class array2d 
{
	public static void main(String a[][])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array limit");
		int limit=sc.nextInt();
		System.out.println("enter the first array values");
		   int  array1[][]=new int[100][100];
	        for( int i=0;i<limit;i++)
	        {
	        	for(int j=0;j<limit;j++)
	        	{
	        	array1[i][j]=sc.nextInt();
	        	}
	        }
	        System.out.println("enter the second array values");
	        int  array2[][]=new int[100][100];
	        for(int i=0;i<limit;i++)
	        {
	        	for(int j=0;j<limit;j++)
	        	{
	        		array2[i][j]=sc.nextInt();
	        	}
	        }
	        
	}

}
