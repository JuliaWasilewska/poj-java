package Lab10.Ex2;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> lotto = new HashSet<Integer>();
        while (lotto.size() < 6){
            Random random = new Random();
            lotto.add(random.nextInt(1,49));
        }
        Set<Integer> user = new HashSet<Integer>();
        while (user.size() < 6){
            user.add(takeLottoNumber(user));
        }
        System.out.println("Wylosowane liczby to:");
        System.out.println(lotto);
        System.out.println("Podane liczby to:");
        System.out.println(user);
        int countStrikes = 0;
        for (int number:user) {
            if(lotto.contains(number)){
                countStrikes++;
            }
        }
        System.out.println("Liczba trafien:");
        System.out.println(countStrikes);
    }

    protected static int takeLottoNumber(Set set){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            System.out.println("Podaj liczbę z przedziału 1-49:");
            number = scanner.nextInt();
            if(number < 0 || number > 49){
                throw new RuntimeException("Numer poza przedziałem");
            }
            if(set.contains(number)){
                throw new RuntimeException("Liczba została już podana");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return takeLottoNumber(set);
        }
        return number;
    }
}
