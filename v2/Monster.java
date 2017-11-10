// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW28 - Ye Olde Role Playing Game
// 2017 - 11 - 8

import java.lang.Math;

public class Monster {

    //Instance Variables
    private int HP;
    private int strength;
    private int defense;
    private double atkRate;

    //Default Constructor
    public Monster() {
	HP = 150; //HP is equal to 150
	strength = (int) ((Math.random() * 45) + 20); //strength is equal to a value between 20 and 65
	defense = 20; //defense is equal to 20
	atkRate = 1; //attack rating is equal to 1
    }

    //Methods
    public boolean isAlive() {
	return (HP > 0); //returns whether or not the HP is above 0
    }

    public int getDefense() {
	return defense; //returns the defense stat
    }

    public void lowerHP(int damage) {
	HP = HP - damage; //alters HP using damage
    }

    public int attack(Protagonist protagonist) {
	int damage = (int) ((strength * atkRate) - protagonist.getDefense()); //damage is equal to strength * attack rating of the monster minus the protagonist's defense
	if (damage < 0) { //if damage is negative, just make it 0
	    damage = 0;
	}
	protagonist.lowerHP(damage); //alter the protagonist's HP using damage
	return damage;
    }
}
