package grade;
import java.util.Scanner;
public class grade {
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the mark scored by the student");
		System.out.println("written test=");
		float written=sc.nextInt();
		System.out.println("lab exams=");
		float lab=sc.nextInt();
		System.out.println("assingnment=");
		float assignment=sc.nextInt();
		float overall=((written*70)/100)+((lab*20)/100)+((assignment*10)/100);
		System.out.println("overall grade is "+overall);
	}

}
