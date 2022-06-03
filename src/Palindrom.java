public class Palindrom
{
    public static void main(String[] args)
    {
        int num=242;
        int n=num;
        int rev=0;
        while (num>0)
        {
            int c = num% 10;
          rev=(rev*10)+c;

          num=num/10;
        }
        if (n==rev)
        {
            System.out.println(rev);

        }



    }
}
