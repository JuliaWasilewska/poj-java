package Lab4.Ex2;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int min;
    int max;
    int goal;

    public Game(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Podaj dolną liczbę zakresu: ");
        this.min = scanner.nextInt();
        System.out.print("Podaj górną liczbę zakresu: ");
        this.max = scanner.nextInt();
        this.goal = random.nextInt(this.min,this.max);
        System.out.println("Liczba została wylosowana z zakresu od " + this.min + " do " + this.max);
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        int round = 0;
        while (round < 5){
            System.out.println("Runda " + (round + 1));
            System.out.print("Podaj liczbę: ");
            int guess = scanner.nextInt();
            if (guess == goal){
                break;
            }
            else if (guess < goal){
                System.out.println("Za mało!");
            }
            else {
                System.out.println("Za dużo!");
            }
            round++;
        }
        if (round == 5){
            System.out.println("Przegrałeś! Szukana liczba: " + goal);
        }
        else {
            System.out.println("Wyrałeś!");
        }
    }

}
