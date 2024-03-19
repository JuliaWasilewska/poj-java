package Lab3.Ex2;

public class Point {
    int x;
    int y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double pointTopPointDistance(int x, int y){
        return Math.sqrt(Math.pow(this.x - x,2) + Math.pow(this.y - y,2));
    }

    public double pointTopPointDistance(Point point){
        return Math.sqrt(Math.pow(this.x - point.x,2) + Math.pow(this.y - point.y,2));
    }

}
