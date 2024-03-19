package Lab2;

import java.util.Random;

public class Ex4 {

    public static void main(String[] args) {
        Random random = new Random();

        int rows = random.nextInt(10) + 1;
        int columns = random.nextInt(10) + 1;

        int[][] tab = new int[rows][columns];

        print2DTab(tab,100);
    }

    public static void print2DTab(int[][] tab){ // Metoda wypisuje tablice 2D wcześniej wypełnioną
        for(int i = 0; i < tab.length; i++){
            System.out.print("|\t");
            for (int j = 0; j < tab[i].length; j++){
                System.out.print(tab[i][j] + "\t");
            }
            System.out.print("|\n");
        }
    }

    public static void print2DTab(int[][] tab, int max){ // Metoda sama wypełnia tablice 2D i ją wypisuje
        Random random = new Random();
        for(int i = 0; i < tab.length; i++){
            System.out.print("|\t");
            for (int j = 0; j < tab[i].length; j++){
                tab[i][j] = random.nextInt(max);
                System.out.print(tab[i][j] + "\t");
            }
            System.out.print("|\n");
        }
    }

}
