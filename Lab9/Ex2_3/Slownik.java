package Lab9.Ex2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Slownik <K,V> {
    private K[] klucze;
    private V[] wartosci;

    public Slownik(int size) {
        klucze = (K[])new Object[size];
        wartosci = (V[]) new Object[size];
    }

    public boolean dodaj(K klucz, V wartosc){
        int freeIndex = pierwszyWolnyIndeks();
        if(czyZawiera(klucz)){
            for (int i = 0; i < klucze.length;i++) {
                if(klucze[i].equals(klucz)){
                    wartosci[i] = wartosc;
                    return true;
                }
            }
            return false;
        }
        else {
            if(freeIndex >= klucze.length){
                return false;
            }
            else {
                klucze[freeIndex] = klucz;
                wartosci[freeIndex] = wartosc;
                return true;
            }
        }
    }


    public boolean czyZawiera(K klucz){
        for (K key: klucze) {
            if(klucz.equals(key)){
                return true;
            }
        }
        return false;
    }

    private int pierwszyWolnyIndeks(){
        if (klucze[0]==null){
            return 0;
        }
        int wolnyIndeks=1;
        for (int i=1;i<klucze.length; i++){
            if (klucze[i]==null){
                return i;
            }
            wolnyIndeks++;
        }
        return wolnyIndeks>klucze.length? -1:wolnyIndeks;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (int i=0;i<pierwszyWolnyIndeks();i++){
            buffer.append(String.format("%s->%s,", klucze[i], wartosci[i]));
        }
        if (buffer.length()>1){
            buffer.deleteCharAt(buffer.length()-1);
        }
        buffer.append("]");
        return buffer.toString();
    }

    public static Slownik<String, String> wczytajSlownik(File file) throws FileNotFoundException {
        Slownik<String,String> slownik = new Slownik<>((int) file.length());
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String[] line = scanner.nextLine().split("-");
            slownik.dodaj(line[0],line[1]);
        }
        return slownik;
    }
}
