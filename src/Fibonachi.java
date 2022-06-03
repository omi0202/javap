public class Fibonachi
{
    public static void main(String[] args)
    {
        int a=1;
        int b=2;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i<10  ; i++)
        {

            int res=a+b;
            System.out.println(res);
            a=b;
            b=res;


        }


    }
}
