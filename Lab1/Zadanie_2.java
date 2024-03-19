package Lab1;

import java.util.Scanner;

public class Zadanie_2 {

    public static void main(String[] args){

        System.out.print("Podaj temperature w stopniach celsjusza:");

        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        double fahrenheit = (float)(9/5) * celsius + 32;

        System.out.println(fahrenheit);

    }

}