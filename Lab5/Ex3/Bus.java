package Lab5.Ex3;

public class Bus extends Vehicle{
    final int NUMBER_OF_WHEALS = 8;
    public Bus(String color, String brand) {
        super(color, brand);
    }
    @Override
    public String getInformation() {
        return "I'm bus and my specification is:\nColor: " + color + "\nBrand: " + brand +
                "\nNumber of wheals:" + NUMBER_OF_WHEALS;
    }
}
