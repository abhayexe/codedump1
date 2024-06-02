import javax.swing.*;
import java.awt.*;

public class Registration {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JScrollBar s = new JScrollBar();
        s.setBounds(450,36,18,500);
        f.add(s);

        JLabel l = new JLabel("Name");
        JTextArea t = new JTextArea();
        l.setBounds(10,4,140,90);
        t.setBounds(140,36,300,25);
        f.add(l);
        f.add(t);

        JLabel l1 = new JLabel("Father's Name");
        JTextArea t1 = new JTextArea();
        l1.setBounds(10,40,140,90);
        t1.setBounds(140,72,300,25);
        f.add(l1);
        f.add(t1);

        JLabel l2 = new JLabel("Gender");
        ButtonGroup g = new ButtonGroup();
        JRadioButton r = new JRadioButton("Male");
        JRadioButton r1 = new JRadioButton("Female");
        JRadioButton r2 = new JRadioButton("Others");
        l2.setBounds(10,80,140,90);
        r.setBounds(140,109,70,30);
        r1.setBounds(215,109,80,30);
        r2.setBounds(300,109,90,30);
        r.setBackground(Color.ORANGE);
        r1.setBackground(Color.ORANGE);
        r2.setBackground(Color.ORANGE);
        f.add(l2);
        f.add(r);
        f.add(r1);
        f.add(r2);
        g.add(r);
        g.add(r1);
        g.add(r2);

        JLabel l3 = new JLabel("D.O.B.");
        JTextArea t2 = new JTextArea();
        l3.setBounds(10,120,140,90);
        t2.setBounds(140,153,300,25);
        f.add(l3);
        f.add(t2);

        JLabel l4 = new JLabel("Roll No");
        JTextArea t3 = new JTextArea();
        l4.setBounds(10,160,140,90);
        t3.setBounds(140,193,300,25);
        f.add(l4);
        f.add(t3);

        JLabel l5 = new JLabel("Branch");
        String[] o = {"CSE", "ECE", "EE", "ME", "CE"};
        JComboBox<String> br = new JComboBox<>(o);
        br.setSelectedIndex(0);
        br.setBounds(140,234,300,25);
        l5.setBounds(10,200,140,90);
        f.add(l5);
        f.add(br);

        JLabel l6 = new JLabel("Semester");
        String[] o1 = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th"};
        JComboBox<String> br1 = new JComboBox<>(o1);
        br1.setSelectedIndex(3);
        br1.setBounds(140,279,300,25);
        l6.setBounds(10,242,140,90);
        f.add(l6);
        f.add(br1);

        JLabel l7 = new JLabel("Address");
        JTextArea t4 = new JTextArea();
//        JTextArea t5 = new JTextArea();
//        JTextArea t6 = new JTextArea();
        l7.setBounds(10,290,140,90);
        t4.setBounds(140,329,300,90);
//        t5.setBounds(140,360,300,25);
//        t6.setBounds(140,392,300,25);
        f.add(l7);
        f.add(t4);
//        f.add(t5);
//        f.add(t6);

        JLabel l8 = new JLabel("Email");
        JTextArea t7 = new JTextArea();
        l8.setBounds(10,407,140,90);
        t7.setBounds(140,440,300,25);
        f.add(l8);
        f.add(t7);

        JLabel l9 = new JLabel("Mobile number");
        JTextArea t8 = new JTextArea();
        l9.setBounds(10,446,140,90);
        t8.setBounds(140,482,300,25);
        f.add(l9);
        f.add(t8);

        JButton btn = new JButton("Submit");
        btn.setBounds(200,550,90,30);
        btn.setBackground(Color.BLUE);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Times New Roman",Font.BOLD,16));
        f.add(btn);

        f.getContentPane().setBackground(Color.ORANGE);
        f.setSize(500,700);
        f.setLayout(null);
        f.setVisible(true);
    }
}