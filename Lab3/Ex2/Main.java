package Lab3.Ex2;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point(3,3);

        System.out.println(point1.pointTopPointDistance(3,3));
        System.out.println(point2.pointTopPointDistance(point1));
    }
}
