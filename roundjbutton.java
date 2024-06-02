import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class roundjbutton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Button Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a custom button
        JButton button = new JButton("Custom Button");

        // Customize the button
        button.setBackground(new Color(35, 35, 35)); // Darker color
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Arial", Font.BOLD, 16));
        button.setFocusPainted(false); // Remove focus border
        button.setCursor(new Cursor(Cursor.HAND_CURSOR)); // Change cursor on hover

        // Set rounded border
        button.setBorder(new RoundedBorder(40, new Color(0, 0, 0)));

        // Add the button to the panel
        panel.add(button);

        // Add the panel to the frame
        frame.add(panel);

        frame.setVisible(true);
    }

    // Custom border class for rounded corners
    static class RoundedBorder implements Border {
        private int radius;
        private Color color;

        RoundedBorder(int radius, Color color) {
            this.radius = radius;
            this.color = color;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(color);
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
            g2.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(radius, radius, radius, radius);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }
}
