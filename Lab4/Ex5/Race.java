package Lab4.Ex5;

public class Race {
    public static void main(String[] args) {
        Competitor[] tab = {
                new Competitor("Adam",2,12),
                new Competitor("Paweł",2,12),
                new Competitor("Piotr",2,12)};

        int raceLength = 1000;


        while(tab[0].distanceTraveled < raceLength && tab[1].distanceTraveled < raceLength && tab[2].distanceTraveled < raceLength){
            tab[0].distanceTraveled += tab[0].biegnij();
            tab[1].distanceTraveled += tab[1].biegnij();
            tab[2].distanceTraveled += tab[2].biegnij();
        }

        for (Competitor competitor : tab) {
            if (competitor.distanceTraveled >= raceLength) {
                System.out.println("Wygrał: ");
                competitor.przedstawSie();
            }
        }
    }
}
