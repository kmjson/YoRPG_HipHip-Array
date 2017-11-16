# YoRPG_HipHip-Array
By Jason Kim, Derek Song, Md Mashrafi

HOW TO PLAY:
  1) Compile and run YoRPG
  2) Choose thy difficulty
  3) Choose thy class
  4) State thy name
  5) SLAY THE MONSTER! 
    - "Feeling lucky?" asks because if you do, one stat will change for the better while there will be a worsening of another.
      - Yay - changes stats.
        - Turtle - Increase def, lower atkRate
        - Mage - Increase atkRate, decrease def
        - Warrior - Increase atkRate, decrease def
      - Nay - keeps stats as is.
      - No, POTION ME! - You don't feel confident at all and request healing.
    - The battle system is very simple. The damage calculator depends on your character's strength and atkRate stats and on the monster's defense stat. There is a bit of randomness involved!
    - Potions will heal you to max health. 
    - You only carry 2 potions with you, so you can heal only twice!
  6) HAVING FUN IS THE MOST IMPORTANT!
  
Code Restructurings:
  1) We made class Monster abstract to implement the about() method in the subclasses. 
  2) We added "========......" lines so one can more clearly see the start of a new turn.
  3) In the driver, a random number generator was added to make random types of monsters encounter you.
  4) We added the abstract method, healer to allow healing. We also needed an instance variable to control this in the driver.
  5) We also added more print lines to give more information.
    - Printing about() for monsters
    - HP stats are visible every turn.
  6) We extended "Feeling Lucky?" to accept an integer [1,3] so we can implement healing. 
 
V5 Updates:
  Balance!!
  1) There was a balance between the protagonists and enemies regarding stats.
  2) HEALING!!! YOU HAVE THE POWER TO HEAL
  3) Other notable additions
    - There are multiple monsters you can encounter!
      - Minotaur
      - Slime
      - Goblin
    - You can now see the amount of health of your character and the enemy as you play.
    
V4 Updates:
Abstract!
  1) specialize(), normalize(), about() are now abstract methods in abstract class Protagonist.
  2) Fixed some stats that were OP.
    - Turtle lost some defense
    - Warrior and Mage lost some strength
  3) Class descriptions are now printed when choosing a class.
  
V3 Updates:
3 NEW CLASSES! WOAH! 
  1) Mage - High Attack, Low HP and Defense
  2) Warrior - Good HP and Attakck, Low Defense
  3) Turtle - High HP and Defense, Low Attack

V2 Updates: 
Class Character!
  1) Protagonist and Monster are now subclasses of superclass, Character.
  
 V1 Updates:
 The Exposition!
  1) We somehow were able to create this. 
  2) Just pushed V1 onto github.
