package Lab3.Ex6;

import java.util.Random;

public class FightingSystem {

    public void fight(Player player,Enemies enemies){
        int round = 1;
        while (player.hp > 0 && enemies.hp > 0){
            int temp_dmg;
            if (round % 2 == 1){
                temp_dmg = atack(player.weapon,player.armor,enemies.armor);
                enemies.hp -= temp_dmg;
                System.out.println("Player inflicted " + temp_dmg + " to Enemy. Enemy HP: " + enemies.hp);
            }
            else {
                temp_dmg = atack(enemies.weapon,enemies.armor,player.armor);
                player.hp -= temp_dmg;
                System.out.println("Enemy inflicted " + temp_dmg + " to player. Player HP: " + player.hp);
            }
            round++;
        }
        if (player.hp > enemies.hp){
            System.out.println("Player won!");
        }
        else {
            System.out.println("Enemy won!");
        }
    }

    private int atack(Weapon weapon, Armor armorAtack, Armor armorDef){
        Random random = new Random();
        int damage = 0;
        int hits;
        if (random.nextInt(0,100) <= weapon.chanceOfDoubleHit - armorAtack.slowPenelty){
            hits = 2;
        }
        else{
            hits = 1;
        }
        for (int i = 0; i < hits; i++){
            if (random.nextInt(0,100) <= weapon.chanceOfCriticalHit + armorAtack.agilityBost){
                damage += weapon.damage * 2;
            }
            else {
                damage += weapon.damage;
            }
        }
        return (int)(damage - (damage * (armorDef.redactionOfDamage/100.0)));
    }
}
