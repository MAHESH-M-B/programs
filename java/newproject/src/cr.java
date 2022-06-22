import java.util.Scanner;
public class cr
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String word=s.nextLine();
        int a=1;
        wordDisplay(word,a);
    }
    static void wordDisplay(String word,int a)
    {
        System.out.println(" "+word);
        a++;
        if(a<=6)
        {
            wordDisplay(word ,a);
        }
    }
}