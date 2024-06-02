import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryToDecimalConverter extends JFrame {

    private JTextField binaryInput;
    private JLabel resultLabel;

    public BinaryToDecimalConverter() {
        initUI();
    }

    private void initUI() {
        setTitle("Binary to Decimal Converter");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1));

        JPanel inputPanel = new JPanel();
        JLabel inputLabel = new JLabel("Enter Binary Number: ");
        inputLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        inputPanel.add(inputLabel);
        
        binaryInput = new JTextField(20);
        binaryInput.setFont(new Font("Arial", Font.PLAIN, 24));
        inputPanel.add(binaryInput);

        JButton convertButton = new JButton("Convert");
        convertButton.setFont(new Font("Arial", Font.BOLD, 18));
        convertButton.setPreferredSize(new Dimension(200, 50));
        convertButton.setBackground(Color.GREEN);
        convertButton.addActionListener(new ConvertAction());

        JPanel resultPanel = new JPanel();
        resultLabel = new JLabel("Decimal Value: ");
        resultLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        resultPanel.add(resultLabel);

        add(inputPanel);
        add(convertButton);
        add(resultPanel);
    }

    private class ConvertAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String binaryString = binaryInput.getText();
            try {
                int decimalValue = Integer.parseInt(binaryString, 2);
                resultLabel.setText("Decimal Value: " + decimalValue);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid binary number");
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            BinaryToDecimalConverter ex = new BinaryToDecimalConverter();
            ex.setVisible(true);
        });
    }
}
