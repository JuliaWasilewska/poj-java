package Lab3.Ex6;

public class Player {
    Weapon weapon;
    Armor armor;
    int hp = 250;

    public Player(){
        Armory armory = new Armory();
        this.weapon = armory.chooseWeapon();
        this.armor = armory.chooseArmor();

    }
}
