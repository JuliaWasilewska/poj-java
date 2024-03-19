package Lab11.Ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame implements ActionListener {
    JTextField numberBox;
    JButton button;
    JLabel gameLabel;

    int number;

    Game() {
        JFrame frame = new JFrame("Enter time");
        Random random = new Random();
        number = random.nextInt(1,100);

        JLabel numberLabel = new JLabel("Podaj liczbę z przedziału 1-100:");
        numberLabel.setBounds(10, 10, 200, 20);
        frame.add(numberLabel);
        numberBox = new JTextField();
        numberBox.setBounds(210, 10, 100, 20);
        frame.add(numberBox);

        button = new JButton("Sprwadz");
        button.setBounds(310, 10, 100, 20);
        button.addActionListener(this);
        frame.add(button);

        gameLabel = new JLabel();
        gameLabel.setBounds(10, 40, 300, 20);
        gameLabel.setText("Wprowadz pierwszą liczbę by poznać wskazówkę");
        frame.add(gameLabel);

        frame.setSize(430, 120);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String n1 = numberBox.getText();
        int guess = Integer.parseInt(n1);

        if(guess == number){
            gameLabel.setText("Wygrałeś! Nowa liczba została wylosowana!");
            Random random = new Random();
            this.number = random.nextInt(1,100);
        }
        else if(guess > number){
            gameLabel.setText("Spróbuj niżej");
        }
        else {
            gameLabel.setText("Spróbuj wyżej");
        }

    }
}