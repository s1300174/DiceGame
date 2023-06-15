import java.util.Random;

public class DiceGame{
    public static void main(String[] args){
	int[] score = new int[2];
	int total = 0, dienum = 1;
	int [] dice = {1, 2, 3, 4, 5, 6};
	Random r = new Random();
	System.out.println("Rolling the dice...");
	for(int i=0; i<2; i++){
	    score[i] = dice[r.nextInt(6)];
	    total += score[i];
	    System.out.println("Die " + dienum +": "+ score[i]);
	    dienum++;
	}
	System.out.println("Total value: " + total);
	if (total > 7) System.out.println("You won!");
        else System.out.println("You lost!");
    }
}
