package Lab3.Ex6;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Enemies enemy = new Enemies();
        FightingSystem fightingSystem = new FightingSystem();
        fightingSystem.fight(player,enemy);
    }
}

