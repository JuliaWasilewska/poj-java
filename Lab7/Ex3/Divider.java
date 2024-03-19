package Lab7.Ex3;
import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        int number = convertToInteger(JOptionPane.showInputDialog(null, "Podaj liczbę"));
        int divider = convertToInteger(JOptionPane.showInputDialog(null, "Podaj dzielnik"));

        int result = divide(number,divider);

        JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
    }

    private static int convertToInteger(String number){
        try{
            return Integer.parseInt(number);
        }
        catch (Exception exception){
            exception.printStackTrace();
            return convertToInteger(JOptionPane.showInputDialog(null, "Podaj liczbę"));
        }
    }

    private static int divide(int number, int divider){
        try {
            return number/divider;
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Błąd, nie można dzielić przez zero");
            System.exit(0);
            return 0;
        }
    }
}