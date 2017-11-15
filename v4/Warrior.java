// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Expanded
// 2017 - 11 - 13

public class Warrior extends Protagonist {
    public Warrior (String str) {
	super(str);
	HP = 125;
	strength = 120;
	defense = 25;
	atkRate = 0.5;
    }

    public void specialize(){
	atkRate = 0.65;
	defense = 15;
    }

    public void normalize(){
	atkRate = 0.5;
	defense = 25;
    }

    public String about() {
	return "This is a Warrior! He has trained in depths of the wilderness and has now chosen to aid in the fight against the monsters! He is well known for his stronger attacks but is also known for having less stamina than his peers.";
    }
}
