/*Johnny Robinson
 * cygnuz007@hotmail.com
APP Calculate a circle circumference and area
 */

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
			
			
			//Create Object name circles
			Circles circles = new Circles(radius);

			
			
			System.out.println("Circumference: " + circles.getFormattedCircumference());
			System.out.println("Area: " + circles.getFormattedArea());
			
			//Number of circles user built
			count = circles.getObjectCount();
			
			//Ask user input
			System.out.println("would you like to create another Circle? (y/n): ");
			choice = sc.next();//Store user input
		}
		    //Print number of circles created
			System.out.println("You created " + count + " Circles");
			System.out.println("Goodbye!");

			sc.close();//Close scanner

		

	}//Close main method

}//Close class
