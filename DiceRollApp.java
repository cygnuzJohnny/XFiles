/*Johnny Robinson
 * cygnuz007@hotmail.com
 * 
 * APP Simulates Dice Rolling
 */

import java.util.Scanner;
import java.util.Random;

public class DiceRollApp {

	public static void main(String[] args) {

		// Declare and initialize instance variables.
		String choice = "";
		int sides = 0;

		// Create Scanner
		Scanner scan = new Scanner(System.in);

		// User Input
		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n): ");
		choice = scan.nextLine(); // Store user input in String variable 'choice'
									

		// Enter loop when user selects 'y' when prompted to roll the dice.
		while (choice.equalsIgnoreCase("y")) {

			System.out.println("How many sides on your dice?");
			sides = scan.nextInt();

			// Create New instance of Die Objects
			Die die1 = new Die();
			Die die2 = new Die();

			// Set value of the 'sides' for Die Objects by calling method, use dot operator
			die1.setSides(sides);
			die2.setSides(sides);

			//Create local int variables
			int result1 = 0;
			int result2 = 0;

			//for-loop set int variable 'i' to 1
			for (int i = 1; i <= sides; i++) {
				result1 = die1.rollDice(sides);
				result2 = die2.rollDice(sides);
			}

			System.out.println(result1);
			System.out.println(result2);

			// Enter 'if/else-statement' and test for the following conditions:
			if (result1 + result2 == 2) {
				System.out.println("SNAKE EYES!");
				break;
			} else if (result1 + result2 == 12) {
				System.out.println("BOXCARS!");
				break;
			} else if (result1 + result2 == 2 || result1 + result2 == 3 || result1 + result2 == 12) {
				System.out.println("CRAPS!");
				break;
			} // exit the 'if/else-statement' and return to the 'while-loop',

			System.out.println("You're Doing Great! Roll again? (y/n): ");
			choice = scan.next();

		} // Exit 'while-loop'

		System.out.println("You're A Big Looser! Maybe next time.");
		scan.close();

		// TODO Auto-generated method stub

	} // Close out main method

}// Close out class
