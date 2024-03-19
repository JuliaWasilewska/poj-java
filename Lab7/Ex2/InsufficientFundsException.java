package Lab7.Ex2;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Insufficient funds!");
    }
}
