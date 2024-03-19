package Lab5.Ex3;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car("Silver","Toyota"),
                new Bus("White","Mercedes"),
                new Truck("Black", "Scania")};


        for (Vehicle moblie: vehicles){
            System.out.println(moblie.getInformation());
        }
    }
}
