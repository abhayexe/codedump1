import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class login{
    public static void main(String args[]){
        JFrame f1 = new JFrame("Login Page");
        f1.setBounds(500, 300, 400, 400);
        f1.setBackground(Color.orange);
        f1.setVisible(true);
        f1.setLayout(null);

        JButton b1 = new JButton("SUBMIT");
        b1.setBounds(100, 250, 100, 30);
        b1.setBackground(Color.green);
        b1.setForeground(Color.black);
        f1.add(b1);

        JButton b2 = new JButton("CANCEL");
        b2.setBounds(230, 250, 100, 30);
        b2.setBackground(Color.red);
        b2.setForeground(Color.white);
        f1.add(b2);

        
    }
}