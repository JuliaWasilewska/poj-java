package Lab5.Ex2;

public class Main {
    public static void main(String[] args) {
        Shop bookshop = new Bookshop("Warszawska","Big");
        Shop bakery = new Bakery("Pomorska","Small");
        System.out.println(bookshop.getInformation());
        System.out.println(bakery.getInformation());
    }
}
