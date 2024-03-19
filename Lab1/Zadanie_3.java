package Lab1;

public class Zadanie_3 {

    public static void main(String[] args) {

        System.out.println("Miles   Kilometers");

        for(int i = 1; i <= 10; i++){
            if( i < 10) {
                System.out.println(i + "        " + i * 1.609);
            }
            else{
                System.out.println(i + "       " + i * 1.609);
            }
        }
    }

}