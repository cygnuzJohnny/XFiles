package FactorialNumber;

/*Johnny Robinson
cygnuz007@hotmail.com
Factorial Table
APP Prompt User to Enter an Integer then Calculate the Factorial of a Number
*/

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int n;
		int product;
		System.out.println("Welcome to the Factorial Calculator!");

		do {
			System.out.print("Enter an integer that's greater than 0 but less than 10:");
			n = sc.nextInt();
			product = fact(n);
			System.out.println("The factorial of " + n);
			System.out.println("is " + product);
			System.out.print("Continue?(y/n): ");
			choice = sc.next();
		} while (choice.equals("y") || choice.equals("Y"));
		//sc.close();
	}

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		} else
			return n * fact(n - 1);
		
	}
	// TODO Auto-generated method stub
}
