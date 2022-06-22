 import java.util.Scanner;
 public class sumof2darray
 {
     public static void main(String a[])
     {
         function f=new function();
         Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int array[][]=new int[100][100];
        f. getArray(size,array);
        f.displayarray(size,array);
     }
 }
