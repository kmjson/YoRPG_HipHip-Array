// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 13 - 12

import java.lang.Math;

public class Slime extends Monster {

    public Slime() {
	HP = 150; //HP is equal to 150
	strength = (int) ((Math.random() * 45) + 5); //strength is equal to a value between 5 and 45
	defense = 50; //defense is equal to 50
	atkRate = 1; //attack rating is equal to 1
    }

    public static String about(){
	return "Slime: The generic gooey junk of mass. Has high defence due to it's elasticity but low damage due to it's lack of strength and movement.";
    }
}
