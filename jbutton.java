import javax.swing.*;
import java.awt.*;

public class jbutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Button Example");
        frame.setSize(300, 200);
        frame.setBackground(Color.BLACK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a custom button
        JButton button = new JButton("Custom Button");

        // Customize the button
        button.setBackground(new Color(235, 235, 235)); // Darker color
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        button.setPreferredSize(new Dimension(200, 50));
        button.setFocusPainted(false); // Remove focus border
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor on hover

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }
}
