package Lab1;

import java.util.Scanner;

public class Zadanie_7 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą literę: ");
        char x = scanner.next().charAt(0);

        System.out.println("Podaj drugą literę: ");
        char y = scanner.next().charAt(0);

        if(x == y){
            System.out.println("To ta sama litera");
        }
        else if(x > y) {
            System.out.println("Pierwsza litera " + x + " jest dalej w alfabecie");
        }
        else {
            System.out.println("Druga litera " + y + " jest dalej w alfabecie");
        }

    }
}
