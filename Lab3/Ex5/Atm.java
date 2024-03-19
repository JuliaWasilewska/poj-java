package Lab3.Ex5;

import java.util.Scanner;
public class Atm {

    public void work(Account[] accounts){
        int id = askId() - 1;
        while(true) {
            switch (actionMenu()) {
                case 1 -> accounts[id].checkBalance();
                case 2 -> accounts[id].withdraw();
                case 3 -> accounts[id].deposit();
                case 4 -> work(accounts);
            }
        }
    }

    private static int actionMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Main menu:\n1:Check balance\n2:Withdraw\n3:Deposit\n4:Exit");
        System.out.print("Enter a choice: ");
        int temp = scanner.nextInt();
        if (temp > 0 && temp <= 4){
            return temp;
        }
        else {
            actionMenu();
        }
        return 0;
    }

    private static int askId(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ID: ");
        int temp = scanner.nextInt();
        if (temp <= 10 && temp > 0){
            return temp;
        }
        else {
            askId();
        }
        return 0;
    }

}
