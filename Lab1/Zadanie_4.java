package Lab1;

import java.util.Scanner;

public class Zadanie_4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę studentów:");
        int number = scanner.nextInt();

        String maxStudent = "";
        int maxScore = 0;

        for(int i = 0; i < number; i++){

            System.out.println("Podaj imię Studenta:");
            String name = scanner.next();

            System.out.println("Podaj liczbę punktów:");
            int score = scanner.nextInt();

            if(score > maxScore){
                maxStudent = name;
                maxScore = score;
            }
        }

        System.out.println("Najlepszy student: " + maxStudent + "\nUzyskał: " + maxScore + " punkty.");
    }
}