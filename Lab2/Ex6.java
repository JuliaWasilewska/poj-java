package Lab2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        int x = scanner.nextInt();

        System.out.println("Podaj drugą liczbę:");
        int y = scanner.nextInt();

        System.out.println("NWD(" + x + "," + y + ") wynosi:\n" + nwd(x,y));
    }

    private static int nwd(int a, int b){
        while(a != b){
            if(a > b){
                a -= b;
            }
            else {
                b -=a;
            }
        }
        return a;
    }
}
