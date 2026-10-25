import java.util.Random;
import java.util.Scanner;

public class NGuess {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("I am thinking");
		System.out.println("Guess m8");
		
		int Thought = (int) (Math.random() * 100) + 1;
		
		int Guess = input.nextInt();
		
		do {
			System.out.println("Tvoja proba: ");
		    if (Guess < Thought) {
			    System.out.println("That's not high enough brochacho");
			
		    } else if (Guess > Thought) {
			    System.out.println("I'm not SnoopDog, that's too high");
			
		    } else {
		    	System.out.println("Just right, " + Thought + " was the number");
		    }
		} while (Guess != Thought);
	}
}