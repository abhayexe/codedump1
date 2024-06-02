import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mycalc{
    public static void main(String args[]){
        //color
        Color darkGrey = new Color(54, 54, 54);
        Color slightDarkGrey = new Color(44, 44, 44);
        Color darkerGrey = new Color(35, 35, 35);
        Color cyann = new Color(20, 235, 215);


        //frame
        JFrame f1 = new JFrame("Nigga calculator ");
        f1.setBounds(500, 200, 365, 550);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(darkerGrey);
        f1.setVisible(true);

        //buttons
        //last row
        JButton b1= new JButton("+/-");
        b1.setBounds(3, 458, 85, 50);
        b1.setBackground(darkGrey);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Arial", Font.BOLD, 15));
        f1.add(b1);

        JButton b2= new JButton("0");
        b2.setBounds(90, 458, 85, 50);
        b2.setBackground(darkGrey);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b2);

        JButton b3= new JButton(".");
        b3.setBounds(177, 458, 85, 50);
        b3.setBackground(darkGrey);
        b3.setForeground(Color.white);
        b3.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b3);

        JButton b4= new JButton("=");
        b4.setBounds(264, 458, 85, 50);
        b4.setBackground(cyann);
        b4.setForeground(Color.black);
        b4.setFont(new Font("Arial", Font.PLAIN, 25));
        f1.add(b4);
        //second last
        JButton b5= new JButton("1");
        b5.setBounds(3, 405, 85, 50);
        b5.setBackground(darkGrey);
        b5.setForeground(Color.white);
        b5.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b5);

        JButton b6= new JButton("2");
        b6.setBounds(90, 405, 85, 50);
        b6.setBackground(darkGrey);
        b6.setForeground(Color.white);
        b6.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b6);

        JButton b7= new JButton("3");
        b7.setBounds(177, 405, 85, 50);
        b7.setBackground(darkGrey);
        b7.setForeground(Color.white);
        b7.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b7);

        JButton b8= new JButton("+");
        b8.setBounds(264, 405, 85, 50);
        b8.setBackground(slightDarkGrey);
        b8.setForeground(Color.white);
        b8.setFont(new Font("Arial", Font.PLAIN, 25));
        f1.add(b8);
        //third last
        JButton b9= new JButton("4");
        b9.setBounds(3, 352, 85, 50);
        b9.setBackground(darkGrey);
        b9.setForeground(Color.white);
        b9.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b9);

        JButton b10= new JButton("5");
        b10.setBounds(90, 352, 85, 50);
        b10.setBackground(darkGrey);
        b10.setForeground(Color.white);
        b10.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b10);

        JButton b11= new JButton("6");
        b11.setBounds(177, 352, 85, 50);
        b11.setBackground(darkGrey);
        b11.setForeground(Color.white);
        b11.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b11);

        JButton b12= new JButton("-");
        b12.setBounds(264, 352, 85, 50);
        b12.setBackground(slightDarkGrey);
        b12.setForeground(Color.white);
        b12.setFont(new Font("Arial", Font.PLAIN, 25));
        f1.add(b12);
        //fourth last
        JButton b13= new JButton("7");
        b13.setBounds(3, 299, 85, 50);
        b13.setBackground(darkGrey);
        b13.setForeground(Color.white);
        b13.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b13);

        JButton b14= new JButton("8");
        b14.setBounds(90, 299, 85, 50);
        b14.setBackground(darkGrey);
        b14.setForeground(Color.white);
        b14.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b14);

        JButton b15= new JButton("9");
        b15.setBounds(177, 299, 85, 50);
        b15.setBackground(darkGrey);
        b15.setForeground(Color.white);
        b15.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b15);

        JButton b16= new JButton("×");
        b16.setBounds(264, 299, 85, 50);
        b16.setBackground(slightDarkGrey);
        b16.setForeground(Color.white);
        b16.setFont(new Font("Arial", Font.PLAIN, 25));
        f1.add(b16);
        //fifth last
        JButton b17= new JButton("1/x");
        b17.setBounds(3, 246, 85, 50);
        b17.setBackground(slightDarkGrey);
        b17.setForeground(Color.white);
        b17.setFont(new Font("Arial", Font.ITALIC, 18));
        f1.add(b17);

        JButton b18= new JButton("x²");
        b18.setBounds(90, 246, 85, 50);
        b18.setBackground(slightDarkGrey);
        b18.setForeground(Color.white);
        b18.setFont(new Font("Arial", Font.ITALIC, 18));
        f1.add(b18);

        JButton b19= new JButton("²√x");
        b19.setBounds(177, 246, 85, 50);
        b19.setBackground(slightDarkGrey);
        b19.setForeground(Color.white);
        b19.setFont(new Font("Arial", Font.PLAIN, 18));
        f1.add(b19);

        JButton b20= new JButton("÷");
        b20.setBounds(264, 246, 85, 50);
        b20.setBackground(slightDarkGrey);
        b20.setForeground(Color.white);
        b20.setFont(new Font("Arial", Font.PLAIN, 25));
        f1.add(b20);
        //6th last
        JButton b21= new JButton("%");
        b21.setBounds(3, 193, 85, 50);
        b21.setBackground(slightDarkGrey);
        b21.setForeground(Color.white);
        b21.setFont(new Font("Arial", Font.PLAIN, 19));
        f1.add(b21);

        JButton b22= new JButton("CE");
        b22.setBounds(90, 193, 85, 50);
        b22.setBackground(slightDarkGrey);
        b22.setForeground(Color.white);
        b22.setFont(new Font("Arial", Font.PLAIN, 15));
        f1.add(b22);

        JButton b23= new JButton("C");
        b23.setBounds(177, 193, 85, 50);
        b23.setBackground(slightDarkGrey);
        b23.setForeground(Color.white);
        b23.setFont(new Font("Arial", Font.PLAIN, 15));
        f1.add(b23);

        JButton b24= new JButton("<X");
        b24.setBounds(264, 193, 85, 50);
        b24.setBackground(slightDarkGrey);
        b24.setForeground(Color.white);
        b24.setFont(new Font("Arial", Font.PLAIN, 19));
        f1.add(b24);

        JLabel l1 = new JLabel("  MC             MR               M+              M-             M↓");
        l1.setBounds(3, 157, 350, 30);
        l1.setBackground(darkerGrey);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Arial", Font.PLAIN, 14));
        f1.add(l1);

        JLabel l2 = new JLabel("≡  Standard     ⤤");
        l2.setBounds(10, 2, 350, 40);
        l2.setBackground(darkerGrey);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        f1.add(l2);

        JTextField t1 = new JTextField();
        t1.setBounds(3, 78, 345, 70);
        t1.setBackground(darkerGrey);
        t1.setForeground(Color.WHITE);
        t1.setFont(new Font("Arial",Font.PLAIN,45));
        f1.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(3, 45, 345, 30);
        t2.setBackground(darkerGrey);
        t2.setForeground(Color.lightGray);
        t2.setFont(new Font("Arial",Font.PLAIN,13));
        f1.add(t2);
    }
}