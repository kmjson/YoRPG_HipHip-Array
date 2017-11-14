// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW28 - Ye Olde Role Playing Game
// 2017 - 11 - 8

public class Protagonist {

    //Instance Variables
    private String name;
    private int HP;
    private int strength;
    private int defense;
    private double atkRate;

    //Default Constructor
    public Protagonist (String str) { //constructor that takes in an attribute (String)
	name = str; //name is now equal to the value of the attribute
	HP = 125; //HP = 125
	strength = 100; //Strength = 100
	defense = 40; //Defense = 40
	atkRate = 0.4; //Attack Rating = 0.4
    }

    //Methods
    public boolean isAlive() {
	return (HP > 0); //returns whether or not if HP is above 0
    }

    public int getDefense() {
	return defense; //returns the defense stat
    }

    public String getName() {
	return name; //returns String name
    }

    public void lowerHP(int damage) {
	HP = HP - damage; //changes HP using integer damage
    }

    public int attack(Monster monster) {
	int damage = (int) ((strength * atkRate) - monster.getDefense()); //damage is equal to the Protagonists Strength * Attack Rate minus the defense of the monster
	if (damage < 0) { //if the Monster's defense is too high, do zero damage insetad of negative
	    damage = 0;
	}
	monster.lowerHP(damage); //affect the HP of Monster with damage
	return damage;
    }

    public void specialize() {
	defense = defense - 10; //decrease defense by 10
	strength = strength + 10; //increase strength by 10
    }

    public void normalize() {
	defense = 40; //defense equals 40
	strength = 100; //strength equals 100
    }
}
	
