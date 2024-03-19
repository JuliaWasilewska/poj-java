package Lab3.Ex4;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = 2;
    String on = "ON";
    int radius = 5;
    String color = "black";
    public Fan(){
    }
    public Fan(int speed,boolean on, int radius,String color){
        this.speed = speed;
        if(on){
            this.on = "ON";
        }
        else {
            this.on = "OFF";
        }
        this.radius = radius;
        this.color = color;
    }

    public void info(){
        System.out.println("Selected fan is " + color + " and have radius of " + radius +
                " cm. Currently selected speed is " + speed + " and power is " + on);
    }
}
