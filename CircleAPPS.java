/*Johnny Robinson
 * cygnuz007@hotmail.com
APP Calculate a circle's circumference and area */

import java.util.Scanner;



public class CircleAPPS {
	
	

	public static void main(String[] args) {
		
		//Declare and initialize variables
		double radius = 0;
		int count = 0;
		String choice = "y";
		
		//Create Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Circle Tester!");
		
		//Enter While Loop
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter radius: ");
			radius = sc.nextDouble();//Enter user input for radius
			
			
			//Create object name circles
			Circles circles = new Circles(radius);

			
			
			System.out.println("Circumference: " + circles.getFormattedCircumference());
			System.out.println("Area: " + circles.getFormattedArea());
			
			//Number of circles user built
			count = circles.getObjectCount();
			
			System.out.println("would you like to create another Circle? (y/n): ");
			choice = sc.next();//Ask user input
		}
			System.out.println("You created " + count + " Circles");
			System.out.println("Goodbye!");

			sc.close();//Close scanner

		// TODO Auto-generated method stub

	}//Close main method

}//Close class
