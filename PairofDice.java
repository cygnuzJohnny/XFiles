package PairofDice;

import java.util.Scanner;

//Johnny Robinson
//Dice Rolling
//APP Prompt User to Roll Dice

public class PairofDice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// String choice = sc.next();
		String choice = "y";

		System.out.println("Welcome to Grand Circus Casino!");
		System.out.println("Roll Again? (y/n)");
		choice = sc.nextLine();
		System.out.println();

		while (choice.equalsIgnoreCase("y")) {

			// Roll the dice
			int die1; // The number on the first die.
			int die2; // The number on the second die.
			int roll; // The total roll (sum of the two dice).
			die1 = (int) (Math.random() * 6) + 1;
			die2 = (int) (Math.random() * 6) + 1;
			roll = die1 + die2;

			// Display the result
			System.out.println("The first die comes up " + die1);
			System.out.println("The second die comes up " + die2);
			System.out.println("Your total roll is " + roll);

			System.out.println("Roll Again? (y/n)");
			choice = sc.nextLine();

			System.out.println("Game Over!");
			sc.close();

			// System.out.print("Roll again? (y/n): ");
			// String choice = sc.next();
			// System.out.println();

		}
	}
}
