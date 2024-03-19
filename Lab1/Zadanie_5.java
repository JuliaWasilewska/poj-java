package Lab1;

import java.util.Scanner;

public class Zadanie_5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą bok trójkąta:");
        int x = scanner.nextInt();

        System.out.println("Podaj drugi bok trójkąta:");
        int y = scanner.nextInt();

        System.out.println("Podaj trzeci bok trójkąta:");
        int z = scanner.nextInt();

        if((x < y + z) && (y < x + z) && (z < x + y)){
            System.out.println("Trójkąt jest prawidłowy.");
        }
        else {
            System.out.println("Trójkąt NIE jest prawidłowy.");
        }

    }

}
