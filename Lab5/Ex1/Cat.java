package Lab5.Ex1;

public class Cat extends Animal{
    public Cat(String name, String color){
        super(name, color);
    }

    @Override
    public String makeSound() {
        return "Nya~~. " + super.makeSound();
    }
}
