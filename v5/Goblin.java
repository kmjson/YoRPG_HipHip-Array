// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Improved
// 2017 - 13 - 12

import java.lang.Math;

public class Goblin extends Monster {

    public Goblin() {
	HP = 110; //HP is equal to 110
	strength = (int) ((Math.random() * 15) + 40); //strength is equal to a value between 40 and 55
	defense = 20; //defense is equal to 20
	atkRate = 1; //attack rating is equal to 1
    }

    public String about(){
	return "Goblin: A green skined humanoid monster the higth of under 4.5 feet. They are a bit tougher than slimes but definitely easier than Minotaurs.";
    }
}
