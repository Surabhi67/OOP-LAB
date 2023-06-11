import java.util.*;

class token
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
        int i;
        String t, r = "", c = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        while(st.hasMoreTokens())
        {
            t = (st.nextToken()).toLowerCase();
            i = t.length();
            c = "";
            while(i-1 >= 0)
            {
                c = c + t.charAt(i - 1);
                i--;
            }
            if( c.equals(t))
                r = r + "*";
            else
                r = r + t;
            r = r + " ";
        }
        System.out.println("The new string is\n" + r);
    }
}