/*Johnny Robinson
 * cygnuz007@hotmail.com
APP Calculate a circle's circumference and area */

import java.util.Scanner;



public class CircleAPPS {
	
	

	public static void main(String[] args) {
		
		double radius = 0;
		int count = 0;
		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Circle Tester!");
		
		while(choice.equalsIgnoreCase("y")) {
			System.out.println("Enter radius: ");
			radius = sc.nextDouble();
			
			Circles circles = new Circles(radius);

			
			System.out.println("Circumference: " + circles.getFormattedCircumference());
			System.out.println("Area: " + circles.getFormattedArea());
			
			count = circles.getObjectCount();
			
			System.out.println("would you like to create another Circle? (y/n): ");
			choice = sc.next();
		}
			System.out.println("You created " + count + " Circles");
			System.out.println("Goodbye!");

			sc.close();

		// TODO Auto-generated method stub

	}

}
