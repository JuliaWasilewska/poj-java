package Lab9.Ex2_3;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Lab9/Ex2_3/test.txt");
        Slownik<String, String> slownik = Slownik.wczytajSlownik(file);
        System.out.println(slownik);
    }
}
