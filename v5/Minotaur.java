// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 13 - 12

import java.lang.Math;

public class Minotaur extends Monster {

    public Minotaur() {
	HP = 120; //HP is equal to 120
	strength = (int) ((Math.random() * 20) + 40); //strength is equal to a value between 40 and 60
	defense = 20; //defense is equal to 20
	atkRate = 1; //attack rating is equal to 1
    }

    public String about(){
	return "Minotaur: A large monster with the head of a bull and body of a muscular giant. Can indure more damage than normal monsters and deal a little more damage than Goblins.";
    }
}
