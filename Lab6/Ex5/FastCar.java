package Lab6.Ex5;

import java.util.Objects;

public class FastCar extends Car {
    int speed;
    String color;
    String brand;
    int yearOfProduction;

    public FastCar(String color,String brand,int yearOfProduction){
        super(color, brand, yearOfProduction);
    }

    public void accelerate(){
        if (speed < 200){
            this.speed += 20;
        }
        else{
            System.out.println("Already max speed!");
        }
    }

    @Override
    public String toString() {
        return color + " " + brand + " rocznik " + yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FastCar car = (FastCar) o;
        return yearOfProduction == car.yearOfProduction && color.equals(car.color) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, yearOfProduction);
    }
}
