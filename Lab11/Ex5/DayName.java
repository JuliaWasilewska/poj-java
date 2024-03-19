package Lab11.Ex5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DayName extends JFrame implements ActionListener {
    JTextField dayBox,monthBox,yearBox;
    JButton button;
    JLabel dayNameLabel;

    DayName() {
        JFrame frame = new JFrame("Enter time");

        JLabel dayLabel = new JLabel("Podaj numer dnia: ");
        dayLabel.setBounds(10, 10, 150, 20);
        frame.add(dayLabel);
        dayBox = new JTextField();
        dayBox.setBounds(150, 10, 100, 20);
        frame.add(dayBox);

        JLabel monthLabel = new JLabel("Podaj numer miesiąca: ");
        monthLabel.setBounds(10, 40, 150, 20);
        frame.add(monthLabel);
        monthBox = new JTextField();
        monthBox.setBounds(150, 40, 100, 20);
        frame.add(monthBox);

        JLabel yearLabel = new JLabel("Podaj rok: ");
        yearLabel.setBounds(10, 70, 150, 20);
        frame.add(yearLabel);
        yearBox = new JTextField();
        yearBox.setBounds(150, 70, 100, 20);
        frame.add(yearBox);

        button = new JButton("Check");
        button.setBounds(300, 40, 100, 20);
        button.addActionListener(this);
        frame.add(button);

        dayNameLabel = new JLabel();
        dayNameLabel.setBounds(75, 100, 300, 20);
        dayNameLabel.setText("Dzień tygodnia to: ");
        frame.add(dayNameLabel);

        frame.setSize(430, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int day = Integer.parseInt(dayBox.getText());
        int month = Integer.parseInt(monthBox.getText());
        int year = Integer.parseInt(yearBox.getText());
        boolean datecheck = true;

        if(day > 31 || day < 1){
            dayNameLabel.setText("Niepoprawny data!");
            datecheck = false;
        }
        if(month > 12 || month < 1){
            dayNameLabel.setText("Niepoprawny data!");
            datecheck = false;
        }
        if(year < 1){
            dayNameLabel.setText("Niepoprawny data!");
            datecheck = false;
        }

        if (datecheck){
            dayNameLabel.setText("Dzień tygodnia to: " + LocalDateTime.of(year,month,day,0,1).getDayOfWeek().name());
        }

    }
}