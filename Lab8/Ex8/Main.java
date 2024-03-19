package Lab8.Ex8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Jan","Kowalski","s1234"),
                new Student("Piort","Nowak","s1235"),
                new Student("Nie","Wiem","s123")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
