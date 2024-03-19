package Lab8.Ex7;

public class Rectangle implements Shape{
    int a;
    int b;

    public Rectangle(int a,int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    @Override
    public double calculatePerimeter() {
        return 2*a+2*b;
    }
}
