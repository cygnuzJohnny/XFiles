
/*Johnny Robinson
 * cygnuz007@hotmail.com
 * The APP calculate the perimeter, area, and volume of classrooms at Grand Circus
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Perimeter {

	public static void main(String[] args) {

		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		double length = 0.0;
		double width = 0.0;
		double area = 0.0;
		double perimeter = 0.0;
		double height = 0.0;
		double volume = 0.0;

		do {
			System.out.println("Enter Length: "); // User Enter Length of Room
			length = sc.nextDouble();

			System.out.println("Enter Width: "); // User Enter Width of Room
			width = sc.nextDouble();

			System.out.print("Enter Height: "); //User Enter Height of Room
			height = sc.nextDouble(); //
			System.out.println();

			area = length * width; // Area of Room is Calculated
			perimeter = 2 * (length + width); // Perimeter of Room is Calculated
			volume = (length * width * height);// Volume of Room is Calculated

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);

			System.out.print("Continue? (y/n):");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("y"));
			sc.close(); // Close Scanner

		// TODO Auto-generated method stub

	}

}
