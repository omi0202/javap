public class RevNo
{
    public static void main(String[] args)
    {
        int num=12345;
        int res=0;
        while (num!=0)
        {
            int last=num%10;
            res=(res*10)+last;
            num=num/10;

        }
        System.out.println(res);


    }
}
