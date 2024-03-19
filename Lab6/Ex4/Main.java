package Lab6.Ex4;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(4,0);
        Time time2 = new Time(6,0);
        System.out.println(time1);
        System.out.println("Add: " + time1.add(time2));
        System.out.println("Substract: " + time1.sub(time2));
        System.out.println("Multi: " + time1.multi(3));
    }
}
