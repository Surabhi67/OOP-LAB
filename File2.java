import java.util.*;
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;

class File2 
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the text to be written");
            String s = sc.nextLine();
            FileWriter fw = new FileWriter("myfile.txt");
            fw.write(s);
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("An error occured\n");    
        }
        try
        {
            FileReader fr = new FileReader("myfile.txt");
            int ch;
            while((ch = fr.read()) != -1)
            {
                System.out.print((char)ch);
            }
            fr.close();
        }
        catch(IOException e)
        {
            System.out.print("An error occured");
        }
    }
}