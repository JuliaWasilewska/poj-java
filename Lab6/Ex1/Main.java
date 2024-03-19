package Lab6.Ex1;

public class Main {
    public static void main(String[] args) {
        Firma firma = new Firma(new Pracownik("Jan","Kowalski",100),new Pracownik("Piotr","Nowak",50));
        System.out.println("Miesięczny koszt: " + firma.obliczMiesiecznyKosztFirmy());
        System.out.println("Roczny koszt: " + firma.obliczRocznyKosztFirmy());
        System.out.println("Koszt w podany czasie: " + firma.obliczKosztFirmy(Czas.MIESIAC,3));
    }
}
