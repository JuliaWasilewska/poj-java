package Lab6.Ex3;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    /*
    public String toString(){
        LocalDateTime myDateObj = LocalDateTime.of(year,month,day,0,0);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("d.MM.yyyy");
        return myDateObj.format(myFormatObj);
    }
     */
    /*
    public String toString(){
        LocalDateTime myDateObj = LocalDateTime.of(year,month,day,0,0);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return myDateObj.format(myFormatObj);
    }
    */
    public String toString(){
        LocalDateTime myDateObj = LocalDateTime.of(year,month,day,0,0);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("d MMM yyyy");
        return myDateObj.format(myFormatObj);
    }
}
