package Lab6.Ex4;

import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class Time {
    int hour;
    int minute;

    public Time(int hour,int minute){
        while (minute >= 60){
            minute -= 60;
            hour += 1;
        }
        while (minute < 0){
            minute += 60;
            hour -= 1;
        }
        while (hour >= 24){
            hour -= 24;
        }
        while (hour < 0){
            hour += 24;
        }
        this.hour = hour;
        this.minute = minute;
    }

    public Time add(Time time){
        return new Time(this.hour + time.hour,this.minute + time.minute);
    }

    public Time sub(Time time){
        return new Time(this.hour - time.hour,this.minute - time.minute);
    }

    public Time multi(int multi){
        return new Time(this.hour * multi,this.minute * multi);
    }

    public String toString() {
        LocalDateTime myDateObj = LocalDateTime.of(1,1,1,hour,minute);
        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("mm");
        return myDateObj.format(myFormatObj1) + "h " + myDateObj.format(myFormatObj2) + "min";
    }
}
