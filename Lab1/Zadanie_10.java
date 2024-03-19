package Lab1;

import java.util.Random;
import java.util.Scanner;

public class Zadanie_10 {

    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int bot = random.nextInt(3);

        System.out.println("Podaj numer (0-kamień, 1-papier, 2-nożyce): ");
        int player = scanner.nextInt();

        System.out.println("Przeciwnik wybrał:\n" + bot);

        System.out.println("Wynik:");

        switch (player) {
            case 0 -> {
                switch (bot) {
                    case 0 -> System.out.println("Remis");
                    case 1 -> System.out.println("Przegrana");
                    case 2 -> System.out.println("Wygrana");
                }
            }
            case 1 -> {
                switch (bot) {
                    case 0 -> System.out.println("Wygrana");
                    case 1 -> System.out.println("Remis");
                    case 2 -> System.out.println("Przegrana");
                }
            }
            case 2 -> {
                switch (bot) {
                    case 0 -> System.out.println("Przegrana");
                    case 1 -> System.out.println("Wygrana");
                    case 2 -> System.out.println("Remis");
                }
            }
        }



    }

}
