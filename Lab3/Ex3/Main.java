package Lab3.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Remote remote = new Remote(new Tv());
        while (true){
            remote.status();
            menu();
            switch (scanner.nextInt()){
                case 1 -> remote.channelUp();
                case 2 -> remote.channelDown();
                case 3 -> remote.volumeUp();
                case 4 -> remote.volumeDown();
                case 5 -> remote.turnOnAndOff();
            }
        }
    }

    private static void menu(){
        System.out.println();
        System.out.println("Available actions:");
        System.out.println("1. Channel Up");
        System.out.println("2. Channel Down");
        System.out.println("3. Volume Up");
        System.out.println("4. Volume Down");
        System.out.println("5. Tv on/off");
        System.out.print("Choose action: ");
    }
}
