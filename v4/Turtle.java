// Team: Hip Hip, Array! - Jason Kim, Derek Song, Muhammad Kashf Mashrafi
// APCS1 pd1
// HW30 - Ye Olde Role Playing Game, Expanded
// 2017 - 11 - 13

public class Turtle extends Protagonist {
    public Turtle (String str) {
	super(str);
	HP = 150;
	strength = 100;
	defense = 40;
	atkRate = 0.4;
    }

    public void specialize() {
	defense = 80;
	atkRate = 0.3;
    }

    public void normalize() {
	defense = 60;
	atkRate = 0.4;
    }
    
    public String about() {
	return "This is a Turtle! But he is not your average turtle that you keep at home! He is a turtle that can withstand a ton of damage and still be able to hurt you back! Don't get on his bad side or else he'll make sure he makes your attacks worthless.";
    }
}
