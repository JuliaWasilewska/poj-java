package Lab11.Ex6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JLabel display;

    Double cache = 0.0;

    String lastDigits = "";

    String lastSign;

    Calculator() {
        JFrame frame = new JFrame("Calculator");

        display = new JLabel();
        display.setBounds(0, 0, 100, 20);
        display.setText(lastDigits.toString());
        frame.add(display);

        JButton button1 = new JButton("1");
        button1.setBounds(0, 50, 50, 50);
        button1.addActionListener(this);
        frame.add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(50, 50, 50, 50);
        button2.addActionListener(this);
        frame.add(button2);

        JButton button3 = new JButton("3");
        button3.setBounds(100, 50, 50, 50);
        button3.addActionListener(this);
        frame.add(button3);

        JButton button4 = new JButton("4");
        button4.setBounds(0, 100, 50, 50);
        button4.addActionListener(this);
        frame.add(button4);

        JButton button5 = new JButton("5");
        button5.setBounds(50, 100, 50, 50);
        button5.addActionListener(this);
        frame.add(button5);

        JButton button6 = new JButton("6");
        button6.setBounds(100, 100, 50, 50);
        button6.addActionListener(this);
        frame.add(button6);

        JButton button7 = new JButton("7");
        button7.setBounds(0, 150, 50, 50);
        button7.addActionListener(this);
        frame.add(button7);

        JButton button8 = new JButton("8");
        button8.setBounds(50, 150, 50, 50);
        button8.addActionListener(this);
        frame.add(button8);

        JButton button9 = new JButton("9");
        button9.setBounds(100, 150, 50, 50);
        button9.addActionListener(this);
        frame.add(button9);

        JButton button0 = new JButton("0");
        button0.setBounds(50, 200, 50, 50);
        button0.addActionListener(this);
        frame.add(button0);

        JButton buttonC = new JButton("C");
        buttonC.setBounds(0, 200, 50, 50);
        buttonC.addActionListener(this);
        frame.add(buttonC);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(100, 200, 50, 50);
        buttonEqual.addActionListener(this);
        frame.add(buttonEqual);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(150, 50, 50, 50);
        buttonPlus.addActionListener(this);
        frame.add(buttonPlus);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(150, 100, 50, 50);
        buttonMinus.addActionListener(this);
        frame.add(buttonMinus);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(150, 150, 50, 50);
        buttonDivide.addActionListener(this);
        frame.add(buttonDivide);

        JButton buttonMulti = new JButton("*");
        buttonMulti.setBounds(150, 200, 50, 50);
        buttonMulti.addActionListener(this);
        frame.add(buttonMulti);


        frame.setSize(215, 290);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("=")){
            cache = cal(lastSign,cache,Double.parseDouble(lastDigits));
            display.setText(cache.toString());
            lastDigits = "";
            lastSign = null;
        }
        else if(e.getActionCommand().equals("+")){
            if(lastSign == null){
                lastSign = "+";
            }
            cache = cal(lastSign,cache,Double.parseDouble(lastDigits));
            lastDigits = "";
            lastSign = "+";
            display.setText(cache.toString());
        }
        else if(e.getActionCommand().equals("-")){
            if(lastSign == null){
                lastSign = "-";
            }
            cache = cal(lastSign,cache,Double.parseDouble(lastDigits));
            lastDigits = "";
            lastSign = "-";
            display.setText(cache.toString());
        }
        else if(e.getActionCommand().equals("*")){
            if(lastSign == null){
                lastSign = "*";
            }
            cache = cal(lastSign,cache,Double.parseDouble(lastDigits));
            lastDigits = "";
            lastSign = "*";
            display.setText(cache.toString());
        }
        else if(e.getActionCommand().equals("/")){
            if(lastSign == null){
                lastSign = "/";
            }
            if(Double.parseDouble(lastDigits) == 0.0){
                display.setText("Nie dziel przez 0");
            }
            else{
                cache = cal(lastSign,cache,Double.parseDouble(lastDigits));
                lastDigits = "";
                lastSign = "/";
                display.setText(cache.toString());
            }
        }
        else if(e.getActionCommand().equals("C")){
            cache = 0.0;
            lastDigits = "";
            display.setText(lastDigits);
        }
        else {
            lastDigits = lastDigits + e.getActionCommand();
            display.setText(lastDigits);
        }
    }

    private double cal(String lastSign,Double cache,Double lastDigits){
        if(lastSign == null){
            return cache;
        }
        if(lastSign.equals("+")){
            return cache + lastDigits;
        }
        if(lastSign.equals("-")){
            return cache - lastDigits;
        }
        if(lastSign.equals("*")){
            return cache * lastDigits;
        }
        if(lastSign.equals("/")){
            return cache / lastDigits;
        }
        return cache;
    }
}