package Lab6.Ex1;

public enum Czas {
    DZIEN(1),
    MIESIAC(20),
    ROK(240);

    final int values;

    Czas(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }
}
