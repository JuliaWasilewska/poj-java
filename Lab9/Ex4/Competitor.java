package Lab9.Ex4;

public class Competitor {
    private String name;
    private String surname;
    private int number;
    private long maxSpeed;

    public Competitor(String name, String surname, int number, long maxSpeed) {
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumber() {
        return number;
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + number + " " + maxSpeed;
    }
}
