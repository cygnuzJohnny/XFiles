package FactorialNumber;

//Johnny Robinson
//Factorial Table
//APP Display a Table of Squares


import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {

		int n, c, fact = 1;
		int value = 0;

		while (value <= 10) {

			System.out.println("Welcome to the Factorial Calculator!");
			System.out.println("Enter an integer tha's greater than 0 but less than 10");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();

			// if (n < 0) {
			// System.out.println("Number should be non-negative.");
			// } else

			for (c = 1; c <= n; c++)
				fact = fact * c;

			System.out.println("Factorial of " + n + " is = " + fact);

			// See if the user wants to continue
			System.out.println("Continue? (y/n): ");
			String Choice = sc.next();
			System.out.println();
			continue;
		}

		{
		}
		// while (choice.equalsIgnoreCase("y"))
	}
	// TODO Auto-generated method stub
}
