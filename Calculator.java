import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator extends JFrame implements ActionListener
{
    static JFrame f;
    static JButton b1,b2, b3, b4, b5, b6, b7, b8, b9, b0, bdo, be, bp, bm, bd, bmu, bc;
    static JTextField l;
    String s0 = "", s1 = "", s2 = "";
    public static void main(String args[])
    {
        JPanel p = new JPanel();
        Calculator c = new Calculator();
        l = new JTextField(16);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdo = new JButton(".");
        bp = new JButton("*");
        bm = new JButton("-");
        bmu = new JButton("+");
        bd = new JButton("/");
        bc = new JButton("C");
        be = new JButton("=");

        b1.addActionListener(c);
        b2.addActionListener(c);
        b3.addActionListener(c);
        b4.addActionListener(c);
        b5.addActionListener(c);
        b6.addActionListener(c);
        b7.addActionListener(c);
        b8.addActionListener(c);
        b9.addActionListener(c);
        b0.addActionListener(c);
        bp.addActionListener(c);
        bm.addActionListener(c);
        bmu.addActionListener(c);
        bd.addActionListener(c);
        be.addActionListener(c);
        bc.addActionListener(c);

        p.add(l);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b0);
        p.add(bp);
        p.add(bm);
        p.add(bd);
        p.add(bmu);
        p.add(be);
        p.add(bc);

        p.setBackground(Color.darkgreen);
        
        f = new JFrame("Calculator");

        f.add(p);
        f.setSize(200, 200);
        f.setLayout(new GridLayout());
        f.show();
    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.charAt(0) >= 0 || s.charAt(0) <= 9 ||s.charAt(0) == '=')
        {
            if(!s1.equals(""))
                s0 = s0 + s;
            else 
                s2 = s2 + s;
            l.setText(s0 + s1 + s2);
        }    
        else if(s.charAt(0) == 'C')
        {
            s0 = s1 = s2 = "";
            l.setText("");
        }
        else if (s.charAt(0) == '=') {
 
            double te;
 
            // store the value in 1st
            if (s1.equals("+"))
                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
            // set the value of text
            l.setText(s0 + s1 + s2 + "=" + te);
 
            // convert it to string
            s0 = Double.toString(te);
 
            s1 = s2 = "";
        }
        else {
            // if there was no operand
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            // else evaluate
            else {
                double te;
 
                // store the value in 1st
                if (s1.equals("+"))
                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
 
                // convert it to string
                s0 = Double.toString(te);
 
                // place the operator
                s1 = s;
 
                // make the operand blank
                s2 = "";
            }
 
            // set the value of text
            l.setText(s0 + s1 + s2);
        }
    }
        
    }

