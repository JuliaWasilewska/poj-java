package Lab11.Ex3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Text extends JFrame implements ActionListener {
    JTextField textBox;
    JButton button;
    JLabel textLabel;

    int number;

    Text() {
        JFrame frame = new JFrame("Enter time");
        Random random = new Random();
        number = random.nextInt(1,100);

        JLabel numberLabel = new JLabel("Podaj tekst: ");
        numberLabel.setBounds(10, 10, 200, 20);
        frame.add(numberLabel);
        textBox = new JTextField();
        textBox.setBounds(210, 10, 100, 20);
        frame.add(textBox);

        button = new JButton("Sprwadz");
        button.setBounds(310, 10, 100, 20);
        button.addActionListener(this);
        frame.add(button);

        textLabel = new JLabel();
        textLabel.setBounds(10, 40, 300, 20);
        textLabel.setText("Wprowadz pierwszą liczbę by poznać wskazówkę");
        frame.add(textLabel);

        frame.setSize(430, 120);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        StringBuilder stringBuilder = new StringBuilder(textBox.getText());
        stringBuilder.reverse();
        textLabel.setText(stringBuilder.toString());

    }
}