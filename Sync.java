import java.util.*;
import java.io.*;
import java.lang.*;

class print
{
    void print1(char c)
    {
                    
        for(int i = 1; i < 6; i++)
        {
            for(int j = 0; j < i; j++)
                System.out.print(c);
            System.out.println();
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e)
            {
                System.out.println("baksjdb");
            }
        
    }
}}

class thread1 extends Thread
{
    public void run()
    {
        print p = new print();
        p.print1('*');
    }
}

class thread2 extends Thread
{
    public void run()
    {
        print p = new print();
        p.print1('#');

    }
}


class Sync
{
    public static void main(String args[])
    {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}
