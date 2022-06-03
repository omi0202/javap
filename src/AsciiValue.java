import java.util.Scanner;

public class AsciiValue
{
    public static void main(String[] args)
    {
        System.out.println("enter value");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        System.out.println("ascii value is ="+ (int)ch);

    }
}
