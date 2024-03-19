package Lab8.Ex7;

public class Main {
    public static void main(String[] args) {
        Shape[] tab = {new Square(2),new Rectangle(2,3),new RightTriangle(2,3)};

        for(Shape shape : tab) {
           System.out.println(shape.calculateArea());
           System.out.println(shape.calculatePerimeter());
        }

    }
}
