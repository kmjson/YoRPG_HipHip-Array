public class Warrior extends Protagonist {
    public Warrior () {
	HP = 125;
	strength = 150;
	defense = 25;
	atkRate = 0.5;
    }

    public static about() {
	return "This is a Warrior! He has trained in depths of the wilderness and has now chosen to aid in the fight against the monsters! He is well known for his stronger attacks but is also known for having less stamina than his peers.";
    }
}
