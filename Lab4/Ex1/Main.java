package Lab4.Ex1;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(1,4);
        Fraction fraction2 = new Fraction(1,4);
        fraction1.add(fraction2);
        fraction1.sub(fraction2);
        fraction1.multi(fraction2);
        fraction1.div(fraction2);
    }
}
