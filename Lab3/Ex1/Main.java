package Lab3.Ex1;

public class Main {
    public static void main(String[] args){
        Square square = new Square(10);

        System.out.println("Kwadrat o boku: " + square.side);
        System.out.println("Obwód danego kwadratu: " + square.perimeter());
        System.out.println("Pole danego kwadratu: " + square.area());
    }
}
