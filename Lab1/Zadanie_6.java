package Lab1;

import java.util.Scanner;

public class Zadanie_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer dnia tygodnia:");
        int day = scanner.nextInt();



        switch (day) {
            case 1 -> System.out.println("Poniedziałek");
            case 2 -> System.out.println("Wtorek");
            case 3 -> System.out.println("Środa");
            case 4 -> System.out.println("Czwartek");
            case 5 -> System.out.println("Piątek");
            case 6 -> System.out.println("Sobota");
            case 7 -> System.out.println("Niedziela");
        }
    }

}
