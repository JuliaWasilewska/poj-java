package Lab4.Ex4;

import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę rzutow do wykonania: ");
        int numberOfThrows = scanner.nextInt();
        Coin coin = new Coin(numberOfThrows);
        coin.Symulation();
    }
}
