package Lab3.Ex6;

import java.util.Scanner;

public  class Armory {
    Weapon[] weapons = {
            new Weapon("Two-handed Sword",25,10,25),
            new Weapon("Dual Wielding daggers",15,100,40),
            new Weapon("Battle Axe",50,0,0),
            new Weapon("Mace",40,5,10),
            new Weapon("Stick",5,100,100)
    };
    Armor[] armors = {
            new Armor("Thieft clocke ", 0,15,5),
            new Armor("Light armor", 5,0,15),
            new Armor("Heavy plated armor", 20,0,30)
    };

    public Weapon chooseWeapon(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available weapon:");
        for (int i = 0; i < weapons.length;i++) {
            System.out.print((i + 1) + ". "); weapons[i].showStats(); System.out.print("\n");
        }
        System.out.print("Choose weapon: ");
        int yourWeapon = scanner.nextInt() - 1;
        System.out.print("\nYour weapon is: "); weapons[yourWeapon].showStats(); System.out.println();
        return weapons[yourWeapon];
    }

    public Armor chooseArmor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Available weapon:");
        for (int i = 0; i < armors.length;i++) {
            System.out.print((i + 1) + ". "); armors[i].showStats(); System.out.print("\n");
        }
        System.out.print("Choose armor: ");
        int yourArmor = scanner.nextInt() - 1;
        System.out.print("\nYour armor is: "); armors[yourArmor].showStats(); System.out.println();
        return armors[yourArmor];
    }
}
