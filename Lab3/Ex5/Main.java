package Lab3.Ex5;

public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10 ; i++) {
            accounts[i] = new Account(i, 100);
        }
        Atm atm = new Atm();
        atm.work(accounts);
    }
}
