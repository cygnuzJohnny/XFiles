/*Johnny Robinson
 * cygnuz007@hotmail.com
 * 
 * APP Simulates Dice Rolling
 */


import java.util.Scanner;
import java.util.Random;

public class DiceRollApp {

	public static void main(String[] args) {

		String choice = "";
		int sides = 0;
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Grand Circus Casino! Roll the dice? (y/n): ");
		choice = scan.nextLine();

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("How many sides on your dice?");
			sides = scan.nextInt();

			Die die1 = new Die();
			Die die2 = new Die();

			die1.setSides(sides);
			die2.setSides(sides);

			int result1 = 0;
			int result2 = 0;

			for (int i = 1; i <= sides; i++) {
				result1 = die1.rollDice(sides);
				result2 = die2.rollDice(sides);
			}

			System.out.println(result1);
			System.out.println(result2);

			if (result1 + result2 == 2) {
				System.out.println("SNAKE EYES!");
				break;
			} else if (result1 + result2 == 12) {
				System.out.println("BOXCARS!");
				break;
			} else if (result1 + result2 == 2 || result1 + result2 == 3 || result1 + result2 == 12) {
				System.out.println("CRAPS!");
				break;
			}

			System.out.println("You're Doing Great! Roll again? (y/n): ");
			choice = scan.next();

		}

		System.out.println("You're A Big Looser! Maybe next time.");
		scan.close();

		// TODO Auto-generated method stub

	}

}
