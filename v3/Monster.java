// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 11 - 12

import java.lang.Math;

public class Monster extends Character {

    //Default Constructor
    public Monster() {
	HP = 150; //HP is equal to 150
	strength = (int) ((Math.random() * 45) + 20); //strength is equal to a value between 20 and 65
	defense = 20; //defense is equal to 20
	atkRate = 1; //attack rating is equal to 1
    }
}
