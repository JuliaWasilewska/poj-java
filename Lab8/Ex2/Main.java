package Lab8.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./Lab8/Ex2/Input");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextInt()){
            int temp = scanner.nextInt();
            if(scanner.hasNextInt()){
                temp += scanner.nextInt();
            }
            System.out.println(temp);
        }
    }
}
