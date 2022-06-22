package qs24;
import java.util.Scanner;
public class area {
	void circle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		float r=sc.nextInt();
		float area=(float)(3.14*r*r);
		System.out.println("area of circle is="+area);
	}
	void rectangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		System.out.println("enter the width");
		int w=sc.nextInt();
		int area=(l*w);
		System.out.println("area is ="+area);
	}
	void square()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		float l=sc.nextInt();
		float area=(l*l);
		System.out.println("the area of square="+area);
		
	}
	void triangle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base");
		float b=sc.nextInt();
		System.out.println("enter the hypotenus");
		float h=sc.nextInt();
		float area=(b*h)/2;
		System.out.println("area of triangle is ="+area);
	}

}
