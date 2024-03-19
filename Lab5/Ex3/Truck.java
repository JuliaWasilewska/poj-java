package Lab5.Ex3;

public class Truck extends Vehicle{
    final int NUMBER_OF_WHEALS = 10;
    public Truck(String color, String brand) {
        super(color, brand);
    }

    @Override
    public String getInformation() {
        return "I'm truck and my specification is:\nColor: " + color + "\nBrand: " + brand +
                "\nNumber of wheals:" + NUMBER_OF_WHEALS;
    }
}
