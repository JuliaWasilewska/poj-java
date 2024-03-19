package Lab4.Ex5;

import java.util.Random;

public class Competitor {
    String name;
    int vMin;
    int vMax;
    int distanceTraveled;

    public Competitor(String name,int vMin,int vMax){
        this.name = name;
        this.vMin = vMin;
        this.vMax = vMax;
    }

    public void przedstawSie(){
        System.out.println("Jestem " + name + " biegam z prędkością " + vMin + "-" + vMax + "km/h");
    }

    public int biegnij(){
        Random random = new Random();
        return random.nextInt(vMin,vMax+1);
    }


}
