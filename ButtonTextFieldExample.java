import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTextFieldExample extends JFrame implements ActionListener {
    private JTextField textField;

    public ButtonTextFieldExample() {
        setTitle("Button and TextField Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create a button with a letter
        JButton button = new JButton("A");
        button.addActionListener(this);

        // Create a text field
        textField = new JTextField();

        // Add button and text field to the panel
        panel.add(button, BorderLayout.CENTER);
        panel.add(textField, BorderLayout.SOUTH);

        // Add panel to the frame
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the text from the button and append it to the text field
        JButton button = (JButton) e.getSource();
        String buttonText = button.getText();
        textField.setText(textField.getText() + buttonText);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ButtonTextFieldExample::new);
    }
}
