package Lab8.Ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeSetter extends JFrame implements ActionListener{
    JTextField hourBox,minuteBox,tokyoTime,londonTime,newYorkTime;
    JButton button;
    JLabel tokyoDateLabel,londonDateLabel,newYorkDateLabel;
    ZonedDateTime time = ZonedDateTime.now();
    DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    TimeSetter() {
        JFrame frame = new JFrame("Enter time");
        JLabel hourLabel = new JLabel("Enter time:");
        hourLabel.setBounds(10,50,75,20);
        frame.add(hourLabel);
        hourBox = new JTextField(String.valueOf(time.getHour()));
        hourBox.setBounds(80,50,40,20);
        frame.add(hourBox);

        JLabel minuteLabel = new JLabel(":");
        minuteLabel.setBounds(122,50,40,20);
        frame.add(minuteLabel);
        minuteBox = new JTextField(String.valueOf(time.getMinute()));
        minuteBox.setBounds(130,50,40,20);
        frame.add(minuteBox);

        button = new JButton("Enter");
        button.setBounds(180,50,100,20);
        button.addActionListener(this);
        frame.add(button);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel tokyoLabel = new JLabel("Time in Tokyo:");
        tokyoLabel.setBounds(10,100,150,20);
        frame.add(tokyoLabel);
        tokyoTime = new JTextField();
        tokyoTime.setBounds(125,100,80,20);
        tokyoTime.setEditable(false);
        frame.add(tokyoTime);
        tokyoDateLabel = new JLabel();
        tokyoDateLabel.setBounds(210,100,80,20);
        frame.add(tokyoDateLabel);

        JLabel londonLabel = new JLabel("Time in London:");
        londonLabel.setBounds(10,150,150,20);
        frame.add(londonLabel);
        londonTime = new JTextField();
        londonTime.setBounds(125,150,80,20);
        londonTime.setEditable(false);
        frame.add(londonTime);
        londonDateLabel = new JLabel();
        londonDateLabel.setBounds(210,150,80,20);
        frame.add(londonDateLabel);

        JLabel newYorkLabel = new JLabel("Time in New York:");
        newYorkLabel.setBounds(10,200,150,20);
        frame.add(newYorkLabel);
        newYorkTime = new JTextField();
        newYorkTime.setBounds(125,200,80,20);
        newYorkTime.setEditable(false);
        frame.add(newYorkTime);
        newYorkDateLabel = new JLabel();
        newYorkDateLabel.setBounds(210 ,200,80,20);
        frame.add(newYorkDateLabel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = hourBox.getText();
        String s2 = minuteBox.getText();

        int hour = Integer.parseInt(s1);
        int minute = Integer.parseInt(s2);

        if(e.getSource()==button){
            LocalDateTime temp = LocalDateTime.of(
                    LocalDateTime.now().getYear(),
                    LocalDateTime.now().getMonth(),
                    LocalDateTime.now().getDayOfMonth(),
                    hour,
                    minute);
            this.time = ZonedDateTime.of(temp,ZonedDateTime.now().getZone());
            ZonedDateTime zonedGMTp9 = time.withZoneSameInstant(ZoneId.of("Japan"));
            ZonedDateTime zonedGMTp1 = time.withZoneSameInstant(ZoneId.of("Europe/London"));
            ZonedDateTime zonedGMTm4 = time.withZoneSameInstant(ZoneId.of("America/New_York"));

            tokyoTime.setText(String.valueOf(zonedGMTp9.format(timeFormatter)));
            tokyoDateLabel.setText(String.valueOf(zonedGMTp9.format(dateFormatter)));

            londonTime.setText(String.valueOf(zonedGMTp1.format(timeFormatter)));
            londonDateLabel.setText(String.valueOf(zonedGMTp1.format(dateFormatter)));

            newYorkTime.setText(String.valueOf(zonedGMTm4.format(timeFormatter)));
            newYorkDateLabel.setText(String.valueOf(zonedGMTm4.format(dateFormatter)));
        }

    }

    public static void main(String[] args) {
        TimeSetter h = new TimeSetter();
    }

}