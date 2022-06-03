public class gcdandlcm
{
    public static void main(String[] args)
    {
        int a=10, b= 60, gcd=1;
        for (int i = 1; i <=a && i<=b; i++)
        {
            if (a%i==0 && b%i==0)
            {
                gcd=i;
            }

        }
        int lcm=(a*b)/gcd;
        System.out.println(lcm);

    }
}
