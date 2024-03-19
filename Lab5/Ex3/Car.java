package Lab5.Ex3;

public class Car extends Vehicle{
    final int NUMBER_OF_WHEALS = 4;
    public Car(String color, String brand) {
        super(color, brand);
    }

    @Override
    public String getInformation() {
        return "I'm car and my specification is:\nColor: " + color + "\nBrand: " + brand +
                "\nNumber of wheals:" + NUMBER_OF_WHEALS;
    }
}
