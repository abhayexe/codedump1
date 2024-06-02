import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DarkModeCalculator extends JFrame implements ActionListener {
    // Create a frame
    private JFrame frame;

    // Create a textfield
    private JTextField textField;

    // Store operator and operands
    private String operator;
    private double firstOperand, secondOperand, result;

    // Create number buttons and some operators
    private JButton[] numberButtons = new JButton[10];
    private JButton addButton, subButton, mulButton, divButton;
    private JButton decButton, equButton, delButton, clrButton;

    // Create a panel
    private JPanel panel;

    // Define colors for dark mode
    private Color bgColor = Color.decode("#1e1e1e");
    private Color buttonColor = Color.decode("#2d2d2d");
    private Color textColor = Color.WHITE;

    public DarkModeCalculator() {
        // Create a frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // Create a textfield
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setBackground(bgColor);
        textField.setForeground(textColor);
        frame.add(textField);

        // Create number buttons and some operators
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(buttonColor);
            numberButtons[i].setForeground(textColor);
        }

        addButton = createButton("+");
        subButton = createButton("-");
        mulButton = createButton("*");
        divButton = createButton("/");
        decButton = createButton(".");
        equButton = createButton("=");
        delButton = createButton("Del");
        clrButton = createButton("Clr");

        // Create a panel and add buttons to it
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(bgColor);

        // Adding buttons to panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Add panel to frame
        frame.add(panel);
        frame.add(delButton).setBounds(50, 430, 145, 50);
        frame.add(clrButton).setBounds(205, 430, 145, 50);

        // Set frame visible
        frame.getContentPane().setBackground(bgColor);
        frame.setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(this);
        button.setFont(new Font("Arial", Font.BOLD, 20));
        button.setFocusable(false);
        button.setBackground(buttonColor);
        button.setForeground(textColor);
        return button;
    }

    public static void main(String[] args) {
        new DarkModeCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }

        if (e.getSource() == addButton) {
            firstOperand = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }

        if (e.getSource() == subButton) {
            firstOperand = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }

        if (e.getSource() == mulButton) {
            firstOperand = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        }

        if (e.getSource() == divButton) {
            firstOperand = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        }

        if (e.getSource() == equButton) {
            secondOperand = Double.parseDouble(textField.getText());

            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    result = firstOperand / secondOperand;
                    break;
            }
            textField.setText(String.valueOf(result));
            firstOperand = result;
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
        }

        if (e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }
    }
}
