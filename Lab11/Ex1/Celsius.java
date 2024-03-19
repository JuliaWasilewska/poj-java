package Lab11.Ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Celsius extends JFrame implements ActionListener {
    JTextField celsiusBox;
    JButton button;
    JLabel fahrenheitLabel;

    Celsius() {
        JFrame frame = new JFrame("Enter time");

        JLabel celsiusLabel = new JLabel("Enter Temperature in Celsius:");
        celsiusLabel.setBounds(10, 10, 200, 20);
        frame.add(celsiusLabel);
        celsiusBox = new JTextField();
        celsiusBox.setBounds(210, 10, 100, 20);
        frame.add(celsiusBox);

        button = new JButton("Enter");
        button.setBounds(310, 10, 100, 20);
        button.addActionListener(this);
        frame.add(button);

        fahrenheitLabel = new JLabel();
        fahrenheitLabel.setBounds(10, 40, 300, 20);
        fahrenheitLabel.setText("Temperatura w Fahrenheitach wynosi: ");
        frame.add(fahrenheitLabel);

        frame.setSize(430, 120);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String c1 = celsiusBox.getText();

        int celsius = Integer.parseInt(c1);
        int fahrenheit = (int) ((celsius * 1.8) + 32);

        fahrenheitLabel.setText("Temperatura w Fahrenheitach wynosi: " + fahrenheit);


    }
}