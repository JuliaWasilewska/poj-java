package Lab1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie_8 {

    public static void main(String[] args){

        Integer[] tab = new Integer[3];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < tab.length; i++){
            System.out.println("Podaj " + (i+1) + " cyfrę: ");
            tab[i] = scanner.nextInt();
        }

        Arrays.sort(tab, Collections.reverseOrder());
        System.out.println(Arrays.toString(tab));

    }
}
