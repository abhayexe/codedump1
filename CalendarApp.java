import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarApp extends JFrame implements ActionListener {
    private JLabel monthLabel;
    private JButton prevButton, nextButton;
    private JPanel calendarPanel;
    private int currentYear, currentMonth;

    public CalendarApp() {
        setTitle("Calendar");
        setBounds(650, 250, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        monthLabel = new JLabel("", JLabel.CENTER);
        prevButton = new JButton("<");
        nextButton = new JButton(">");

        prevButton.addActionListener(this);
        nextButton.addActionListener(this);

        topPanel.add(prevButton, BorderLayout.WEST);
        topPanel.add(monthLabel, BorderLayout.CENTER);
        topPanel.add(nextButton, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);

        calendarPanel = new JPanel(new GridLayout(0, 7));
        add(calendarPanel, BorderLayout.CENTER);

        Calendar calendar = Calendar.getInstance();
        currentYear = calendar.get(Calendar.YEAR);
        currentMonth = calendar.get(Calendar.MONTH);

        updateCalendar();
    }

    private void updateCalendar() {
        calendarPanel.removeAll();

        Calendar calendar = new GregorianCalendar(currentYear, currentMonth, 1);
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (String day : days) {
            JLabel dayLabel = new JLabel(day, JLabel.CENTER);
            dayLabel.setOpaque(true);
            dayLabel.setBackground(Color.LIGHT_GRAY);
            calendarPanel.add(dayLabel);
        }

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        for (int i = 0; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }

        for (int day = 1; day <= daysInMonth; day++) {
            JLabel dayLabel = new JLabel(String.valueOf(day), JLabel.CENTER);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (dayOfWeek == Calendar.SUNDAY) {
                dayLabel.setOpaque(true);
                dayLabel.setBackground(Color.pink);
            } else if (dayOfWeek == Calendar.SATURDAY) {
                dayLabel.setOpaque(true);
                dayLabel.setBackground(Color.cyan);
            }
            calendarPanel.add(dayLabel);
        }

        monthLabel.setText(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, getLocale()) + " " + currentYear);

        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {
            currentMonth--;
            if (currentMonth < 0) {
                currentMonth = 11;
                currentYear--;
            }
        } else if (e.getSource() == nextButton) {
            currentMonth++;
            if (currentMonth > 11) {
                currentMonth = 0;
                currentYear++;
            }
        }
        updateCalendar();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalendarApp app = new CalendarApp();
            app.setVisible(true);
        });
    }
}
