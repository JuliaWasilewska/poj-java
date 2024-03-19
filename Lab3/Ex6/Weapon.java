package Lab3.Ex6;

public class Weapon {
    String name;
    int damage;
    int chanceOfDoubleHit;
    int chanceOfCriticalHit;

    public Weapon(String name,int damage, int chanceOfDoubleHit, int chanceOfCriticalHit){
        this.name = name;
        this.damage = damage;
        this.chanceOfDoubleHit = chanceOfDoubleHit;
        this.chanceOfCriticalHit = chanceOfCriticalHit;
    }

    public void showStats(){
        System.out.print(name + " [DMG: " + damage + " | Chance of double hit: " + chanceOfDoubleHit + " | Chance of critical hit: " + chanceOfCriticalHit + "]");
    }
}
