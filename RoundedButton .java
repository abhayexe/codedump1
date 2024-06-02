import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RoundedButton extends JFrame implements ActionListener {
    Container container;
    JLabel title;
    JLabel nameLabel;
    JTextField nameField;
    JLabel ageLabel;
    JTextField ageField;
    JLabel courseLabel;
    JComboBox<String> courseBox;
    RoundedButton submitButton;
    RoundedButton resetButton;
    JTextArea outputArea;
    JPanel formPanel;
    JPanel buttonPanel;

    String courses[] = { "Computer Science", "Electronics", "Mechanical", "Civil", "Biotechnology" };

    public RoundedButton() {
        setTitle("Student Registration Form");
        setBounds(300, 90, 600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(new BorderLayout());
        container.setBackground(new Color(240, 248, 255)); // Light blue background

        title = new JLabel("Student Registration Form", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        title.setForeground(new Color(0, 128, 128)); // Teal color
        container.add(title, BorderLayout.NORTH);

        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(3, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50));
        formPanel.setBackground(new Color(240, 248, 255)); // Light blue background

        nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        nameLabel.setForeground(new Color(25, 25, 112)); // Midnight blue color
        formPanel.add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 18));
        nameField.setBackground(new Color(255, 255, 240)); // Ivory color
        formPanel.add(nameField);

        ageLabel = new JLabel("Age");
        ageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        ageLabel.setForeground(new Color(25, 25, 112)); // Midnight blue color
        formPanel.add(ageLabel);

        ageField = new JTextField();
        ageField.setFont(new Font("Arial", Font.PLAIN, 18));
        ageField.setBackground(new Color(255, 255, 240)); // Ivory color
        formPanel.add(ageField);

        courseLabel = new JLabel("Course");
        courseLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        courseLabel.setForeground(new Color(25, 25, 112)); // Midnight blue color
        formPanel.add(courseLabel);

        courseBox = new JComboBox<>(courses);
        courseBox.setFont(new Font("Arial", Font.PLAIN, 18));
        courseBox.setBackground(new Color(255, 255, 240)); // Ivory color
        formPanel.add(courseBox);

        container.add(formPanel, BorderLayout.CENTER);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 20, 50));
        buttonPanel.setBackground(new Color(240, 248, 255)); // Light blue background

        submitButton = new RoundedButton("Submit");
        submitButton.setFont(new Font("Arial", Font.PLAIN, 18));
        submitButton.setBackground(new Color(60, 179, 113)); // Medium sea green
        submitButton.setForeground(Color.WHITE); // White text color
        submitButton.addActionListener(this);
        buttonPanel.add(submitButton);

        resetButton = new RoundedButton("Reset");
        resetButton.setFont(new Font("Arial", Font.PLAIN, 18));
        resetButton.setBackground(new Color(255, 69, 0)); // Red-orange color
        resetButton.setForeground(Color.WHITE); // White text color
        resetButton.addActionListener(this);
        buttonPanel.add(resetButton);

        container.add(buttonPanel, BorderLayout.SOUTH);

        outputArea = new JTextArea();
        outputArea.setFont(new Font("Arial", Font.PLAIN, 18));
        outputArea.setBorder(BorderFactory.createTitledBorder("Output"));
        outputArea.setEditable(false);
        outputArea.setBackground(new Color(255, 255, 240)); // Ivory color
        outputArea.setForeground(new Color(25, 25, 112)); // Midnight blue color
        container.add(outputArea, BorderLayout.EAST);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String age = ageField.getText();
            String course = (String) courseBox.getSelectedItem();
            if (name.isEmpty() || age.isEmpty() || course.isEmpty()) {
                outputArea.setText("Please fill all the fields");
            } else {
                outputArea.setText("Name: " + name + "\nAge: " + age + "\nCourse: " + course);
            }
        } else if (e.getSource() == resetButton) {
            nameField.setText("");
            ageField.setText("");
            courseBox.setSelectedIndex(0);
            outputArea.setText("");
        }
    }

    public static void main(String[] args) {
        new RoundedButton();
    }
}
