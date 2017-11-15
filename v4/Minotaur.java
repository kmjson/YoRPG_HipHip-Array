// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 13 - 12

import java.lang.Math;

public class Minotaur extends Monster {

    public Minotaur() {
	HP = 300; //HP is equal to 300
	strength = (int) ((Math.random() * 45) + 25); //strength is equal to a value between 25 and 70
	defense = 25; //defense is equal to 25
	atkRate = 1; //attack rating is equal to 1
    }

    public static String about(){
	return "Minotaur: A large monster with the head of a bull and body of a muscular giant. Can indure more damage than normal monsters and deal a little more damage than Goblins.";
    }
}
