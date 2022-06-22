package array1;

public class uniquedel
{
	public static void main(String ar[])
	{
		int a[]= {1,2,3,2,6,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
			System.out.println(a[i]);
			}
		}
	}

}
