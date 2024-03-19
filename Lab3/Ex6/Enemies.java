package Lab3.Ex6;

import java.util.Random;
import java.util.Scanner;

public class Enemies {
    Weapon weapon;
    Armor armor;
    int hp = 250;

    public Enemies(Weapon weapon,Armor armor){
        this.weapon = weapon;
        this.armor = armor;
    }

    public Enemies(){
        Enemies enemies = chooseEnemy(createEnemiesList(3));
        this.weapon = enemies.weapon;
        this.armor = enemies.armor;
    }

    public Enemies[] createEnemiesList(int numberOfEnemies){
        Enemies[] tab = new Enemies[numberOfEnemies];
        Armory armory = new Armory();
        Random random = new Random();
        for (int i = 0; i < numberOfEnemies ; i++){
            wait(25);
            tab[i] = new Enemies(armory.weapons[random.nextInt(0,armory.weapons.length)],
                    armory.armors[random.nextInt(0,armory.armors.length)]);
        }
        return tab;
    }

    public Enemies chooseEnemy(Enemies[] enemies){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nList of enemies: ");
        for (int i = 0; i < enemies.length ; i++){
            System.out.print((i+1) + ". Enemy with ");
            enemies[i].weapon.showStats();
            System.out.print(" and ");
            enemies[i].armor.showStats();
            System.out.print("\n");
        }
        System.out.print("Choose enemy: ");
        int yourEnemy = scanner.nextInt() - 1;
        System.out.print("\nYou fighting against enemy equipped with ");
        enemies[yourEnemy].weapon.showStats();
        System.out.print(" and ");
        enemies[yourEnemy].armor.showStats();
        System.out.println();
        return enemies[yourEnemy];
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
