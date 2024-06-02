import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class testcode2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setBounds(500, 200, 300, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t = new JTextField();
        t.setBounds(3, 45, 283, 30);
        f.add(t);

        JButton b1 = new JButton("1");
        b1.setBounds(3, 150, 40, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "1");
            }
        });
        f.add(b1);

        JButton b2 = new JButton("2");
        b2.setBounds(46, 150, 40, 30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "2");
            }
        });
        f.add(b2);

        JButton b3 = new JButton("+");
        b3.setBounds(89, 150, 50, 30);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t.setText(t.getText() + "+");
            }
        });
        f.add(b3);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(150, 150, 100, 30);
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String expression = t.getText();
                String[] tokens = expression.split("\\+");
                int result = 0;
                for (String token : tokens) {
                    result += Integer.parseInt(token.trim());
                }
                t.setText(Integer.toString(result));
            }
        });
        f.add(calculateButton);

        f.setVisible(true);
    }
}
