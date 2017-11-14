// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 11 - 12

public class Protagonist extends Character {

    //Instance Variables
    protected String name;

    //Default Constructor
    public Protagonist (String str) { //constructor that takes in an attribute (String)
	name = str; //name is now equal to the value of the attribute
	HP = 125; //HP = 125
	strength = 100; //Strength = 100
	defense = 40; //Defense = 40
	atkRate = 0.4; //Attack Rating = 0.4
    }

    //Methods
    public String getName() {
	return name; //returns String name
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
	
