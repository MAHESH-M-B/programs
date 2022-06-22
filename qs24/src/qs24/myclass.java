
package qs24;
import java.util.Scanner;
public class myclass extends area {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.circle\n 2.rectagel\n 3.square\n triangle\n enter your choice");
		int choice=sc.nextInt();
		myclass s=new myclass();
		switch(choice) {
		case 1:
			s.circle();
		break;
		case 2:
			s.rectangle();
		break;
		case 3:
			s.square();
		break;
		case 4:
			s.triangle();
		break;
		default:
			System.out.println("invalid entry");
		}
	}
	

}
