package Lab3.Ex4;

public class Main {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan(3,true,10,"White");

        fan1.info();
        fan2.info();
    }
}
