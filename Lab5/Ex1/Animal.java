package Lab5.Ex1;

public class Animal {
    String name;
    String color;

    public Animal(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String makeSound(){
        return "I'm " + name + ", my fur is " + color;
    }

}
