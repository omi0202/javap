public class Revstring
{
    public static void main(String[] args)
    {
        String s="onkar";
        char ch;
        String rev="";

        for (int i =s.length()-1; i >=0 ; i--)
        {
            ch=s.charAt(i);
            rev=rev+ch;


        }
        System.out.print(rev);

    }
}
