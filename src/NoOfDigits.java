import java.util.Scanner;

public class NoOfDigits
{
    public static void main(String[] args)
    {
        System.out.println("enter any value");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;


        while (num>0)
        {
           int rem=num%10;
            count++;
            num /= 10;
        }

        System.out.println(count);
    }
}
