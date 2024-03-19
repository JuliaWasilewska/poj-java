package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkość tablicy:");
        int size = scanner.nextInt();

        String[] tab = new String[size];

        for(int i = 0; i < size; i++ ){
            System.out.println("Podaj znaki które mają znaleść sie na pozycji " + (i+1) + " tablicy:");
            tab[i] = scanner.next();
        }

        System.out.println("Wygenerowana tablica to: " + Arrays.toString(tab));
    }

}
