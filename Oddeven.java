import java.util.*;
import java.io.*;
import java.io.FileWriter;

class prime extends Thread
{
    String s = "";
    public prime(String s)
    {
        this.s = s;
    }
    public void run()
    {
        try
        { 
            StringTokenizer st = new StringTokenizer(s," ");
            FileWriter fw1 = new FileWriter("prime.txt");
            while(st.hasMoreTokens())
            {
                int flag = 0;
                String temp = st.nextToken();
                int n = Integer.parseInt(temp);
                if(n == 1|| n == 0)
                    flag = 1;
                for(int i = 2; i <= n/2; i++)
                {
                    if(n%i == 0)
                        flag = 1;
                }
                if(flag == 0)
                {
                    fw1.write(temp);
                    fw1.write(" ");
                }
            }   
            fw1.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
        }
        
    }
}

class nonprime extends Thread
{
    String s = "";
    public nonprime(String s)
    {
        this.s = s;
    }
    public void run()
    {
        try
        {
            StringTokenizer st = new StringTokenizer(s," ");
            FileWriter fw2 = new FileWriter("nonprime.txt");
            while(st.hasMoreTokens())
            {
                String temp = st.nextToken();
                int n = Integer.parseInt(temp);
                if(n == 1|| n == 0)
                    {
                    fw2.write(temp);
                    fw2.write(" ");
                    }
                else
                {
                for(int i = 2; i <= n/2; i++)
                {
                    if(n%i == 0)
                    {
                    fw2.write(temp);
                    fw2.write(" ");
                    break;
                    }
                }
            }
            }   
            fw2.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
        }
        
    }
}


class Oddeven 
{
    public static void main(String args[])
    {
    try
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the integers");
    String s = sc.nextLine();
    FileWriter fw1 = new FileWriter("even.txt");
    FileWriter fw2 = new FileWriter("odd.txt");
    StringTokenizer st = new StringTokenizer(s," ");
    while(st.hasMoreTokens())
    {
        String temp = st.nextToken();
        int n = Integer.parseInt(temp);
        if(n%2 == 0)
        {
            fw1.write(temp);
            fw1.write(" ");
        }
        else
        {
            fw2.write(temp);
            fw2.write(" ");
        }
    }
    fw1.close();
    fw2.close();
    prime Thread1 = new prime(s);
    nonprime Thread2 = new nonprime(s);
    Thread1.start();
    Thread2.start();
    }
    catch(IOException e)
    {
        System.out.println("An error occured");
    }
}
}
