package Lab8.Ex7;

public class RightTriangle implements Shape{
    int a;
    int b;

    public RightTriangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return (a*b)/2.0;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + Math.sqrt((a*a) + (b*b));
    }
}
