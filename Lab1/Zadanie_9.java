package Lab1;

import java.util.Scanner;

public class Zadanie_9 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędną x pierwszego punktu: ");
        int x1 = scanner.nextInt();

        System.out.println("Podaj współrzędną y pierwszego punktu: ");
        int y1 = scanner.nextInt();

        System.out.println("Podaj współrzędną x drugiego punktu: ");
        int x2 = scanner.nextInt();

        System.out.println("Podaj współrzędną y drugiego punktu: ");
        int y2 = scanner.nextInt();

        double odl = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));


        System.out.println("Odległość pomiędzy punktami wynosi:\n" + odl);

    }

}
