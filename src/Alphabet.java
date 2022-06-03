import java.util.Scanner;

public class Alphabet
{
    public static void main(String[] args)
    {
        System.out.println("enter any char");
        Scanner sc= new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch>='A' && ch<='Z')
        {
            System.out.println("char is alphabet");
        }
       else if (ch>='a' && ch<='z')
        {
            System.out.println("char is not alphabet");
        } else {
            System.out.println("enter valid char");
        }


    }
}
