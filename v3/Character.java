// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 11 - 12

public class Character {

    //Instance Variables
    protected int HP;
    protected int strength;
    protected int defense;
    protected double atkRate;
    
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
    
    public int attack(Character opponent) {
	int damage = (int) ((strength * atkRate) - opponent.getDefense()); //damage is equal to strength * attack rating of the attacker  minus the opponent's defense
	if (damage < 0) { //if damage is negative, just make it 0
	    damage = 0;
	}
	opponent.lowerHP(damage); //alter the opponent's HP using damage
	return damage;
    }
}
