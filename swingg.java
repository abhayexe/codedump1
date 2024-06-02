import java.awt.*;
//import java.awt.Color;

import javax.swing.*;
public class swingg{
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setSize(500, 1000);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.lightGray);
        f.setVisible(true);
        
        JButton b1 = new JButton("SUBMIT");
        b1.setBounds(100,750,130,30);
        b1.setBackground(Color.GREEN);
        f.add(b1);

        JButton b2 = new JButton("CANCEL");
        b2.setBounds(240,750,130,30);
        b2.setBackground(Color.RED);
        f.add(b2);

        JTextField t1 = new JTextField();
        t1.setFont(null);
        t1.setBounds(150,50,200,30);
        //t1.setBackground(Color.CYAN);
        f.add(t1);

        JLabel l1 = new JLabel("Enter name:");
        l1.setBounds(40,50,100,30);
        f.add(l1);

        JLabel l2 = new JLabel("Enter email:");
        l2.setBounds(40,100,100,30);
        f.add(l2);

        JTextField t2 = new JTextField();
        t2.setFont(null);
        t2.setBounds(150,100,200,30);
        //t2.setBackground(Color.CYAN);
        f.add(t2);

        JLabel l3 = new JLabel("@gmail.com");
        l3.setBounds(350,100,100,30);
        f.add(l3);

        JLabel l4 = new JLabel("Gender:");
        l4.setBounds(40,150,70,30);
        f.add(l4);

        ButtonGroup g1 = new ButtonGroup();
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        JRadioButton r3 = new JRadioButton("Others");

        r1.setBounds(150, 150, 70,30);
        r2.setBounds(230, 150, 70,30);
        r3.setBounds(300, 150, 70,30);

        r1.setBackground(Color.lightGray);
        r2.setBackground(Color.lightGray);
        r3.setBackground(Color.lightGray);
        
        f.add(r1);
        f.add(r2);
        f.add(r3);

        JLabel l5 = new JLabel("Roll no.:");
        l5.setBounds(40,200,70,30);
        f.add(l5);

        JTextField t3 = new JTextField();
        t3.setFont(null);
        t3.setBounds(150,200,200,30);
        //t3.setBackground(Color.CYAN);
        f.add(t3);

        JLabel l6 = new JLabel("Adress:");
        l6.setBounds(40,250,70,30);
        f.add(l6);

        JTextArea t4 = new JTextArea();
        t4.setBounds(150,260,200,70);
        f.add(t4);

        JLabel l7 = new JLabel("Branch: ");
        l7.setBounds(40,360,70,30);
        f.add(l7);

        String[] s1 = {"CSE", "ECE", "EE", "ME", "CE"};
        JComboBox<String> c1 = new JComboBox<>(s1);
        c1.setSelectedIndex(0);
        c1.setBounds(150, 360, 200, 30);
        f.add(c1);

        JLabel l8 = new JLabel("Year: ");
        l8.setBounds(40,420,70,30);
        f.add(l8);

        String[] s2 = {"1st", "2nd", "3rd", "4th"};
        JComboBox<String> c2 = new JComboBox<>(s2);
        c2.setSelectedIndex(0);
        c2.setBounds(150, 420, 200, 30);
        f.add(c2);
    }
}