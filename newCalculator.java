import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class newCalculator extends JFrame{
    private double firstNumber;
    private double secondNumber;
    private boolean adding = false;
    private boolean subtract = false;
    private boolean multiply = false;
    private boolean divide = false;

    newCalculator() {
        final JTextField t = new JTextField();
        final JTextField t1 = new JTextField();

        t.setBounds(10, 10, 360, 60);
        t1.setBounds(10, 80, 360, 60);
        t.setFont(new Font("Arial",Font.BOLD,30));
        t1.setFont(new Font("Arial",Font.BOLD,30));
        add(t);
        add(t1);

        final JButton b = new JButton("7");
        b.setBounds(10,150,100,40);
        b.setFont(new Font("Arial",Font.BOLD,25));
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "7");
            }
        });
        add(b);

        JButton b1 = new JButton("8");
        b1.setBounds(110,150,100,40);
        b1.setFont(new Font("Arial",Font.BOLD,25));
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "8");
            }
        });
        add(b1);

        JButton b2 = new JButton("9");
        b2.setBounds(210,150,100,40);
        b2.setFont(new Font("Arial",Font.BOLD,25));
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "9");
            }
        });
        add(b2);

        final JButton b3 = new JButton("+");
        b3.setBounds(310,150,60,40);
        b3.setFont(new Font("Arial",Font.BOLD,25));
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                firstNumber = Double.parseDouble(t.getText());
                t.setText("");
                adding = true;
            }
        });
        add(b3);

        JButton b4 = new JButton("4");
        b4.setBounds(10,190,100,40);
        b4.setFont(new Font("Arial",Font.BOLD,25));
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "4");
            }
        });
        add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(110,190,100,40);
        b5.setFont(new Font("Arial",Font.BOLD,25));
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "5");
            }
        });
        add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(210,190,100,40);
        b6.setFont(new Font("Arial",Font.BOLD,25));
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "6");
            }
        });
        add(b6);

        final JButton b7 = new JButton("-");
        b7.setBounds(310,190,60,40);
        b7.setFont(new Font("Arial",Font.BOLD,25));
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                firstNumber = Double.parseDouble(t.getText());
                t.setText("");
                subtract = true;
            }
        });
        add(b7);

        JButton b8 = new JButton("1");
        b8.setBounds(10,230,100,40);
        b8.setFont(new Font("Arial",Font.BOLD,25));
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "1");
            }
        });
        add(b8);

        JButton b9 = new JButton("2");
        b9.setBounds(110,230,100,40);
        b9.setFont(new Font("Arial",Font.BOLD,25));
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "2");
            }
        });
        add(b9);

        JButton b10 = new JButton("3");
        b10.setBounds(210,230,100,40);
        b10.setFont(new Font("Arial",Font.BOLD,25));
        b10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "3");
            }
        });
        add(b10);

        JButton b11 = new JButton("*");
        b11.setBounds(310,230,60,40);
        b11.setFont(new Font("Arial",Font.BOLD,25));
        b11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                firstNumber = Double.parseDouble(t.getText());
                t.setText("");
                multiply = true;
            }
        });
        add(b11);

        JButton b12 = new JButton("AC");
        b12.setBounds(10,270,100,40);
        b12.setFont(new Font("Arial",Font.BOLD,25));
        b12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText("");
                t1.setText("");
            }
        });
        add(b12);

        JButton b13 = new JButton("0");
        b13.setBounds(110,270,100,40);
        b13.setFont(new Font("Arial",Font.BOLD,25));
        b13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                t.setText(t.getText() + "0");
            }
        });
        add(b13);

        JButton b14 = new JButton("=");
        b14.setBounds(210,270,100,40);
        b14.setFont(new Font("Arial",Font.BOLD,25));
        b14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(adding){
                    secondNumber = Double.parseDouble(t.getText());
                    double result = firstNumber + secondNumber;
                    t1.setText(String.valueOf(result));
                    t.setText(firstNumber + " + " + secondNumber + " = ");
                    adding = false;
                }else if(subtract){
                    secondNumber = Double.parseDouble(t.getText());
                    double result = firstNumber - secondNumber;
                    t1.setText(String.valueOf(result));
                    t.setText(firstNumber + " - " + secondNumber + " = ");
                    subtract = false;
                }else if(multiply){
                    secondNumber = Double.parseDouble(t.getText());
                    double result = firstNumber * secondNumber;
                    t1.setText(String.valueOf(result));
                    t.setText(firstNumber + " x " + secondNumber + " = ");
                    multiply = false;
                }else if(divide) {
                    secondNumber = Double.parseDouble(t.getText());
                    double result = firstNumber / secondNumber;
                    t1.setText(String.valueOf(result));
                    t.setText(firstNumber + " / " + secondNumber + " = ");
                    divide = false;
                }

            }
        });
        add(b14);

        JButton b15 = new JButton("/");
        b15.setBounds(310,270,60,40);
        b15.setFont(new Font("Arial",Font.BOLD,25));
        b15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                firstNumber = Double.parseDouble(t.getText());
                t.setText("");
                divide = true;
            }
        });
        add(b15);


        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int red = (int) (Math.random() * 256);
                int green = (int) (Math.random() * 256);
                int blue = (int) (Math.random() * 256);

                Color color = new Color(red, green, blue);

                b.setForeground(color);
                b1.setForeground(color);
                b2.setForeground(color);
                b3.setForeground(color);
                b4.setForeground(color);
                b5.setForeground(color);
                b6.setForeground(color);
                b7.setForeground(color);
                b8.setForeground(color);
                b9.setForeground(color);
                b10.setForeground(color);
                b11.setForeground(color);
                b12.setForeground(color);
                b13.setForeground(color);
                b14.setForeground(color);
                b15.setForeground(color);
                t.setForeground(color);
                t1.setForeground(color);
            }
        });
        timer.start();

        getContentPane().setBackground(Color.black);
        setSize(395,360);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        newCalculator C = new newCalculator();
    }
}