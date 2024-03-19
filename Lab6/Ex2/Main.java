package Lab6.Ex2;

public class Main {
    public static void main(String[] args) {
        Zamowienia zamowienia = new Zamowienia( 2);
        zamowienia.dodajPozycje(new Pozycja("Kawa",10,5));
        zamowienia.dodajPozycje(new Pozycja("Hot-dog",2,5));
        zamowienia.dodajPozycje(new Pozycja("Piwo",2,5));
        System.out.println(zamowienia);
    }
}
