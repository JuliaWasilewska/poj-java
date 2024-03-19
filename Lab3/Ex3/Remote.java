package Lab3.Ex3;

public class Remote {
    Tv tv;

    public Remote(Tv tv){
        this.tv = tv;
    }

    public void channelUp(){
        if (tv.channel < 20 && tv.on){
            tv.channel++;
        }
        else if (tv.channel == 20 && tv.on){
            tv.channel = 1;
        }
        else if (!tv.on){
            System.out.println("Tv is off!");
        }
    }

    public void channelDown(){
        if (tv.channel >= 2 && tv.on){
            tv.channel--;
        }
        else if (tv.channel == 1 && tv.on){
            tv.channel = 20;
        }
        else if (!tv.on){
            System.out.println("Tv is off!");
        }
    }

    public void volumeUp(){
        if (tv.volume < 10 && tv.on){
            tv.volume++;
        }
        else if (!tv.on){
            System.out.println("Tv is off!");
        }
        else {
            System.out.println("Volume is already at maximum value");
        }
    }

    public void volumeDown(){
        if (tv.volume >= 2 && tv.on){
            tv.volume--;
        }
        else if (!tv.on){
            System.out.println("Tv is off!");
        }
        else {
            System.out.println("Volume is already at minimum value");
        }
    }

    public void turnOnAndOff(){
        tv.on = !tv.on;
    }

    public void status(){
        if (tv.on){
            System.out.println();
            System.out.println("Tv is on");
            System.out.println("Current channel: " + tv.channel);
            System.out.println("Current volume: " + tv.volume);
        }
        else {
            System.out.println();
            System.out.println("Tv is off");
        }
    }

}
