package project.DiceRoll;
import java.util.Random;
public class Dice {
public static void main(String[] args) {
	int [] rolls = { 1,2,3,4,5,6};
	Random ran = new Random();
	
int l = rolls.length;

int rand = ran.nextInt(l);
	System.out.println(rand);
	
}
}
