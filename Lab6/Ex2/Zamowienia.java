package Lab6.Ex2;

public class Zamowienia {
    Pozycja[] pozycje;
    int maxSize;

    public Zamowienia (int maxSize){
        this.maxSize = maxSize;
        this.pozycje = new Pozycja[maxSize];
    }
    public Zamowienia (){
        this.maxSize = 10;
        this.pozycje = new Pozycja[maxSize];
    }

    public void dodajPozycje(Pozycja pozycja){
        for (int i = 0; i < pozycje.length; i++){
            if(pozycje[i] == null){
                pozycje[i] = pozycja;
                break;
            }
            else if (i == pozycje.length - 1 && pozycje[i] != null){
                System.out.println("Zamowienia pełne! Nie można dodać " + pozycja.nazwaTowaru);
                break;
            }
        }
    }

    public double obliczWartosc(){
        double suma = 0;
        for (Pozycja pozycja: pozycje) {
            if (pozycja == null){
                break;
            }
            suma += pozycja.obliczWartosc();
        }
        return suma;
    }
    @Override
    public String toString(){
        String temp = "";
        temp = temp.concat("Zamówinie:\n");
        for (Pozycja pozycja : pozycje){
            if (pozycja == null){
                break;
            }
            temp = temp.concat(pozycja.toString());
        }
        temp = temp.concat("Wartość koncowa: " + obliczWartosc() + "zł");
        return temp;
    }
}
