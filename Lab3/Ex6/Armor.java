package Lab3.Ex6;

public class Armor {
    String name;
    int slowPenelty;
    int agilityBost;
    int redactionOfDamage;

    public Armor(String name, int slowPenelty, int agilityBost, int negationOfDamage){
        this.name = name;
        this.slowPenelty = slowPenelty;
        this.agilityBost = agilityBost;
        this.redactionOfDamage = negationOfDamage;
    }

    public void showStats(){
        System.out.print(name + " [Percent of damage redaction: " + redactionOfDamage + " | Slow: " + slowPenelty + " | Agility boost: " + agilityBost + "]");
    }
}
