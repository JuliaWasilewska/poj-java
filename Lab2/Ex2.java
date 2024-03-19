package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wielkość tablicy:");
        int size = scanner.nextInt();

        System.out.println("Podaj pierwszą pozycje: ");
        int first = scanner.nextInt();

        int[] tab = bulidTab(size,first);

        statsOfTab(tab);
    }

    public static int[] bulidTab(int size, int first){

        int[] tab = new int[size];

        tab[0] = first;

        if (size >= 2){
            int next;
            if(first % 2 == 1){
                next = first + 1;
            }
            else {
                next = first + 2;
            }
            tab[1] = next;
        }

        if(size >= 3){
            for(int i = 2; i < size; i++){
                tab[i] = tab[i-1] + 2;
            }
        }

        return tab;
    }

    public static int minInTab(int[] tab){
        int min = tab[0];

        for (int j : tab) {
            if (min > j) {
                min = j;
            }
        }

        return min;
    }

    public static int maxInTab(int[] tab){
        int max = tab[0];

        for(int i : tab){
            if(max < i){
                max = i;
            }
        }

        return max;
    }

    public static int sumOfTab(int[] tab){
        int sum = 0;

        for(int i : tab){
            sum += i;
        }

        return sum;
    }

    public static double averageTab(int[] tab){
        int sum = 0;

        for(int i : tab){
            sum += i;
        }

        return (sum/(double)(tab.length));
    }

    public static double medianTab(int[] tab){
        double med;

        if(tab.length % 2 == 1){
            med = tab[(tab.length / 2)];
        }
        else {
            med = (tab[(tab.length / 2)-1] + tab[(tab.length / 2)]) / 2.0;
        }

        return med;
    }

    public static void statsOfTab(int[] tab){
        System.out.println("Powstała tablica:");
        System.out.println(Arrays.toString(tab));
        System.out.println("Statystyki:");
        System.out.println("Wartość minimalna: " + minInTab(tab));
        System.out.println("Wartość maksymalna: " + maxInTab(tab));
        System.out.println("Suma wartość: " + sumOfTab(tab));
        System.out.println("Średnia wartość: " + averageTab(tab));
        System.out.println("Mediana wartość: " + medianTab(tab));
    }
}
