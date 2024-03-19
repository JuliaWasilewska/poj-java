package Lab6.Ex5;

import java.util.Objects;

public class Car {
    int speed;
    String color;
    String brand;
    int yearOfProduction;

    public Car(String color,String brand,int yearOfProduction){
        this.color = color;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.speed = 0;
    }

    public void accelerate(){
        if (speed < 140){
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
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && color.equals(car.color) && brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, brand, yearOfProduction);
    }
}
