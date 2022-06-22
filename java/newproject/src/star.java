public class star 
{
public static void main(String ar[])
{
	for(int i=1;i<=10;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		for(int k=10;k>i;k--)
		{
			System.out.print(" ");
		}
		for(int l=10;l>i;l--)
		{
		    System.out.print(" ");	
		}
		for(int m=1;m<=i;m++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}

    