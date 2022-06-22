public class numpattern4_2
 {
    public static void main(String a[])
    { 
        int num=i;
        num1=(i-1)+(i-1);
       for(int i=1;i<=5;i++)
       {
           for(int j=4;j>=i;j--)
           {
            System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
               System.out.print(i);
               num++;
           }
           for(int k=1;k<i;k++)
           {
              System.out.print("*");
           }
           System.out.println("\n");
       }
    }
}
