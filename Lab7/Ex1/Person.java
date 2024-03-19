package Lab7.Ex1;

import java.util.Scanner;

public class Person {
    private String name;
    private String surname;
    private int yearOfBirth;

    public Person(String name,String surname,int yearOfBirth){
        try {
            this.setName(name);
        }
        catch (EmptyStringException e){
            e.printStackTrace();
        }
        try {
            this.setSurname(surname);
        }
        catch (EmptyStringException e){
            e.printStackTrace();
        }
        try {
            this.setYearOfBirth(yearOfBirth);
        }
        catch (AgeOutOfSpecException e){
            e.printStackTrace();
        }

    }

    public Person(){
        setName();
        setSurname();
        setYearOfBirth();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyStringException {
        if(name == null || name.equals("")){
            throw new EmptyStringException("Podano niewłaściwe imię!");
        }
        else {
            this.name = name;
        }
    }

    private void setName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj Imię: ");
        try {
            this.setName(scanner.next());
        }
        catch (EmptyStringException e){
            e.printStackTrace();
            setName();
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws EmptyStringException{
        if(surname == null || surname.equals("")){
            throw new EmptyStringException("Podano niewłaściwe Nazwisko!");
        }
        else {
            this.surname = name;
        }
    }

    private void setSurname(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj Nazwisko: ");
        try {
            this.setSurname(scanner.next());
        }
        catch (EmptyStringException e){
            e.printStackTrace();
            setSurname();
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) throws AgeOutOfSpecException{
        if(yearOfBirth > 2020 || yearOfBirth < 1900){
            throw new AgeOutOfSpecException("Podano niewłaściwy rok urodzenia!");
        }
        else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    private void setYearOfBirth(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rok urodzenia: ");
        try {
            this.setYearOfBirth(scanner.nextInt());
        }
        catch (AgeOutOfSpecException e){
            e.printStackTrace();
            setYearOfBirth();
        }
    }
}
