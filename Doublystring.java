import java.util.*;
import java.io.*;



class Doublystring
{
    class node
    {
        String s;
        node next;
        node prev;
        node(String s)
        {
            this.s = s;
            next = null;
            prev = null;
        }
    }

    node head = null, temp = null, tail = null,temp1 = null;

    void insert(String s)
    {
        node newnode = new node(s); 
        if(head == null)
        {
            head = newnode;
            tail = newnode;
        }
        else
        {
            tail.next = newnode;
            tail = newnode;
        }

    }

    void insertp(String s, String t)
    {
        try 
        {
        node newnode = new node(s); 
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else if(t.equals(head.s))
        {
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
        else
        {
            temp = head;
            while(!(temp.s).equals(t) && temp != null)
            {
                temp1 = temp;
                temp = temp.next;
            }
            newnode.prev = temp.prev;
            temp.prev = newnode;
            newnode.next = temp;
            temp1.next = newnode;
        }
    }
    catch(NullPointerException e)
    {
        System.out.println("String not in list");
    }
    }

    String delete()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return null;
        }
        else if(head.next == null)
        {
            head = null;
            tail = null;
            return null;
        }
        else
        {
            temp = tail;
            tail = tail.prev;
            tail.next = null;
            return temp.s;
        }
    }

    void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            temp = head;
            while(temp != null)
            {
                System.out.print(temp.s + "   ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int op;
        String s = "", t = "";
        Doublystring d = new Doublystring();
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose the option\n1.Insert\n2.Insert previous\n3.Delete\n4.Vowels\n5.Reverse\n6.Display\n7.Exit");
            op = sc.nextInt();
            switch(op)
            {
                case 1:
                    System.out.println("Enter the string to insert");
                    s = sc.next();
                    d.insert(s);
                    break;
                case 2:
                    System.out.println("Enter the string to insert");
                    s = sc.next();
                    System.out.println("Enter the string before to insert");
                    t = sc.next();
                    d.insertp(s, t);
                    break;
                case 3:
                    s = d.delete();
                    System.out.println(s + " is deleted");
                    break;
                case 6:
                    d.display();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(op != 7);
    }
}