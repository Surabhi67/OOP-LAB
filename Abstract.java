import java.util.*;

abstract class hello
{
    void hello1()
    {
    System.out.println("helloooooo");
    }
}

class Abstract extends hello{
    Abstract(String s)
    {
        System.out.println(s);
        hello1();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Abstract a = new Abstract(s);
    }
}
