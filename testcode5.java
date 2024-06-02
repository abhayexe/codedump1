import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class testcode5 {
    public static void main(String args[]) {
        // Color
        Color darkGrey = new Color(54, 54, 54);
        Color slightDarkGrey = new Color(44, 44, 44);
        Color darkerGrey = new Color(35, 35, 35);
        Color cyann = new Color(20, 235, 215);

        // Frame
        JFrame f1 = new JFrame("Calculator");
        f1.setBounds(500, 200, 365, 550);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setBackground(darkerGrey);

        // TextFields
        JTextField t1 = new JTextField();
        t1.setBounds(3, 78, 345, 70);
        t1.setBackground(darkerGrey);
        t1.setForeground(Color.WHITE);
        t1.setFont(new Font("Arial", Font.PLAIN, 45));
        t1.setHorizontalAlignment(JTextField.RIGHT); // Right-align text
        t1.setEditable(false); // Make it non-editable
        f1.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(3, 45, 345, 30);
        t2.setBackground(darkerGrey);
        t2.setForeground(Color.lightGray);
        t2.setFont(new Font("Arial", Font.PLAIN, 13));
        t2.setHorizontalAlignment(JTextField.RIGHT); // Right-align text
        t2.setEditable(false); // Make it non-editable
        f1.add(t2);

        // Buttons
        JButton[] buttons = new JButton[24];
        String[] buttonText = {
            "+/-", "0", ".", "=",
            "1", "2", "3", "+",
            "4", "5", "6", "-",
            "7", "8", "9", "×",
            "1/x", "x²", "²√x", "÷",
            "%", "CE", "C", "<X"
        };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonText[i]);
            buttons[i].setBounds((i % 4) * 87, 193 + (i / 4) * 57, 85, 50);
            buttons[i].setBackground(i < 16 ? darkGrey : slightDarkGrey);
            buttons[i].setForeground(Color.white);
            buttons[i].setFont(new Font("Arial", Font.PLAIN, i < 16 ? 18 : 15));
            f1.add(buttons[i]);
        }

        // Current expression to be evaluated
        StringBuilder expression = new StringBuilder();

        // Action Listeners
        for (JButton button : buttons) {
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String buttonText = button.getText();
                    switch (buttonText) {
                        case "+/-":
                            // Change sign functionality
                            if (!expression.toString().isEmpty()) {
                                if (expression.charAt(0) == '-') {
                                    expression.deleteCharAt(0);
                                } else {
                                    expression.insert(0, '-');
                                }
                                t2.setText(expression.toString());
                            }
                            break;
                        case "0":
                        case "1":
                        case "2":
                        case "3":
                        case "4":
                        case "5":
                        case "6":
                        case "7":
                        case "8":
                        case "9":
                        case ".":
                            // Append number or decimal point to the expression
                            expression.append(buttonText);
                            t2.setText(expression.toString());
                            break;
                        case "+":
                        // Append operator to the expression
                        if (!expression.toString().isEmpty() && !isOperator(expression.charAt(expression.length() - 1))) {
                            expression.append(buttonText);
                            t2.setText(expression.toString());
                        }
                        break;
                    
                        case "-":
                        case "×":
                        case "÷":
                            // Append operator to the expression
                            if (!expression.toString().isEmpty() && !isOperator(expression.charAt(expression.length() - 1))) {
                                expression.append(buttonText);
                                t2.setText(expression.toString());
                            }
                            break;
                        case "=":
                            // Evaluate the expression
                            if (!expression.toString().isEmpty()) {
                                try {
                                    double result = evaluateExpression(expression.toString());
                                    t1.setText(Double.toString(result));
                                    expression.setLength(0); // Clear expression after evaluation
                                } catch (ArithmeticException ex) {
                                    t1.setText("Error");
                                }
                            }
                            break;
                        case "CE":
                            // Clear last entry
                            if (expression.length() > 0) {
                                expression.deleteCharAt(expression.length() - 1);
                                t2.setText(expression.toString());
                            }
                            break;
                        case "C":
                            // Clear everything
                            expression.setLength(0);
                            t1.setText("");
                            t2.setText("");
                            break;
                        case "<X":
                            // Backspace functionality
                            if (expression.length() > 0) {
                                expression.deleteCharAt(expression.length() - 1);
                                t2.setText(expression.toString());
                            }
                            break;
                        case "1/x":
                            // Reciprocal functionality
                            if (!expression.toString().isEmpty()) {
                                try {
                                    double value = 1 / Double.parseDouble(expression.toString());
                                    t1.setText(Double.toString(value));
                                    expression.setLength(0); // Clear expression after evaluation
                                } catch (NumberFormatException ex) {
                                    t1.setText("Error");
                                }
                            }
                            break;
                        case "x²":
                            // Square functionality
                            if (!expression.toString().isEmpty()) {
                                try {
                                    double value = Double.parseDouble(expression.toString());
                                    t1.setText(Double.toString(value * value));
                                    expression.setLength(0); // Clear expression after evaluation
                                } catch (NumberFormatException ex) {
                                    t1.setText("Error");
                                }
                            }
                            break;

                        case "²√x":
                            // Square root functionality
                            if (!expression.toString().isEmpty()) {
                                try {
                                    double value = Double.parseDouble(expression.toString());
                                    if (value >= 0) {
                                        t1.setText(Double.toString(Math.sqrt(value)));
                                        expression.setLength(0); // Clear expression after evaluation
                                    } else {
                                        t1.setText("Error");
                                    }
                                } catch (NumberFormatException ex) {
                                    t1.setText("Error");
                                }
                            }
                            break;
                        case "%":
                            // Percentage functionality
                            if (!expression.toString().isEmpty()) {
                                try {
                                    double value = Double.parseDouble(expression.toString());
                                    t1.setText(Double.toString(value / 100));
                                    expression.setLength(0); // Clear expression after evaluation
                                } catch (NumberFormatException ex) {
                                    t1.setText("Error");
                                }
                            }
                            break;
                    }
                }
            });
        }

        // Labels
        JLabel l1 = new JLabel("  MC             MR               M+              M-");
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

    f1.setVisible(true);
}

// Method to evaluate arithmetic expression
private static double evaluateExpression(String expression) throws ArithmeticException {
    try {
        return new java.util.Scanner(expression).nextDouble();
    } catch (java.util.InputMismatchException e) {
        throw new ArithmeticException("Invalid expression");
    }
}

// Method to check if a character is an operator
private static boolean isOperator(char c) {
    return c == '+' || c == '-' || c == '×' || c == '÷';
}
}
