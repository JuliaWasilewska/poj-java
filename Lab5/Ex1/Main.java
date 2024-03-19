package Lab5.Ex1;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Daisy" , "Black");
        Animal dog = new Dog("Burek", "Brown");
        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
    }
}
