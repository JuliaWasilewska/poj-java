package Lab6.Ex1;

public class Pracownik {
    String name;
    String surname;
    int dailypay;

    public Pracownik(String name,String surname,int dailypay){
        this.name = name;
        this.surname = surname;
        this.dailypay = dailypay;
    }

    public int getDailypay() {
        return dailypay;
    }
}
