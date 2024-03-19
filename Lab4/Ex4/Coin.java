package Lab4.Ex4;

import java.util.Random;

public class Coin {
    int numberOfThrows;
    int tails;
    int heads;

    Coin(int numberOfThrows){
        this.numberOfThrows = numberOfThrows;
    }

    public void Symulation(){
        tails = 0;
        heads = 0;
        for(int i = 1; i <= numberOfThrows; i++){
            switch (coinFlip()){
                case 1 -> tails++;
                case 2 -> heads++;
                default -> System.out.println("XD");
            }
        }
        System.out.println("Tails chance: " + String.format("%.2f",((tails / (float) numberOfThrows) * 100)) + "%");
        System.out.println("Heads chance: " + String.format("%.2f",((heads / (float) numberOfThrows) * 100)) + "%");
    }

    private static int coinFlip(){
        Random random = new Random();
        return random.nextInt(1,3);
    }
}
