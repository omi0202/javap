import java.util.Scanner;

public class vowel
{
    public static void main(String[] args)
    {
        System.out.println("Enter any 1 char");
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("chr is vowel");
        }
        else
        {
            System.out.println("chr is not vowel");

        }


    }
}
