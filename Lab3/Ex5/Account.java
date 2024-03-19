package Lab3.Ex5;

import java.util.Scanner;

public class Account {
    public int id;
    private int balance;

    public Account(int id, int balance){
        this.id = id;
        this.balance = balance;
    }

    public void checkBalance(){
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();
        if(amount < 0){
            System.out.println("Incorrect withdrawal amount");
        }
        else if (balance < amount){
            System.out.println("Amount you want to withdraw is greater than account balance");
        }
        else{
            balance -= amount;
            System.out.println("You just withdrew: " + amount + ". New balance: " + balance);
        }
    }

    public void deposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();
        if(amount < 0){
            System.out.println("Incorrect deposit amount!");
        }
        else {
            balance += amount;
            System.out.println("You've just deposited: " + amount + ". New balance: " + balance);
        }
    }

}
