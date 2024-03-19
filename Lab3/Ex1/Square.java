package Lab3.Ex1;

public class Square {
    int side;

    public Square(int side){
        this.side = side;
    }

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return side*4;
    }
}
