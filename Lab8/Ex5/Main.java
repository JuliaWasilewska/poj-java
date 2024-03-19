package Lab8.Ex5;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        int year = LocalDateTime.now().getYear();
        for (int i = 1; i <= 100;){
            if(year % 4 == 0){
                if(year % 100 == 0){
                    if(year % 400 == 0){
                        System.out.println(i + "\t" +year);
                        i++;
                    }
                }
                else {
                    System.out.println(i + "\t" +year);
                    i++;
                }
            }
            year++;
        }
    }
}
