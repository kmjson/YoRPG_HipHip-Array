// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 13 - 12

import java.lang.Math;

public class Goblin extends Monster {

    public  Goblin() {
	HP = 200; //HP is equal to 200
	strength = (int) ((Math.random() * 45) + 20); //strength is equal to a value between 20 and 65
	defense = 20; //defense is equal to 20
	atkRate = 1; //attack rating is equal to 1
    }

    public static String about(){
	return "Goblin: A green skined humanoid monster the higth of under 4.5 feet. They are a bit tougher than slimes but definitely easier than Minotaurs.";
    }
}
