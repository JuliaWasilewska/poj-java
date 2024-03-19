package Lab6.Ex5;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Red", "BMW", 2000);
        FastCar fastCar = new FastCar("Red", "BMW", 2000);
        for(int i = 1; i <= 8; i++){
            car.accelerate();
        }
        System.out.println(car);
        System.out.println(car.equals(fastCar));
        System.out.println(fastCar.equals(car));
    }
}
