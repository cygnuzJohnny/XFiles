import java.util.Scanner;

/*Johnny Robinson
 * cygnuz007@hotmail.com
 * APP Provide info about students and recognize invalid inputs
 */


public class InputsInvalid {

				
			public static void main(String[] args) {
				
				//Create scanner
				Scanner sc = new Scanner(System.in);
				
				//Create Array with Names, Hometown, Favorite Food
				String[][] names = {
						{ "Johnny", "Detroit", "Thai" },
						{ "Elle", "Egypt", "Soulfood" },
						{ "Dominique", "London", "Seafood" },
						{ "Yasmine", "Toronto", "Chinese" },
						{ "Jennifer", "Paris", "Creole" },
						{ "Kim", "Chicago", "Spicy" },
						{ "Zalika", "New York", "Jamacain" },
						{ "Kristen", "Amsterdam", "Soup" },
						{ "Vanesa", "Atlanta", "Mexican" },
						{ "Mary", "Dallas", "BBQ" },
						{ "Ruth", "Miami", "Cuban" },
						{ "Monique", "Chicago", "Seafood" },
						{ "Linda", "Boston", "Shrimp" },
						{ "Pam", "St. Louis", "Chinese" },
						{ "Cheryl", "San Diego", "Cuban" },
						{ "Lisa", "Los Angelas", "BBQ" },
						{ "Veronica", "New Orleans", "Cajuan" },
						{ "Shelly", "Cleveland", "Soulfood" },
						{ "Barbra", "Chicago", "Mexican" },
						{ "Delia", "Boston", "Moroccan" } };

				String choice = "y";
				System.out.println("Welcome to Grand Circus Java class!");
				
				//Enter While Loop
				while (choice.equalsIgnoreCase("y")) {
					System.out.println("Which student would you like to learn about");
					
					//Loops through each name to print it out to the console
					for (int i = 0; i < names.length; i++) {
						System.out.println((i + 1) + ". " + names[i][0]);
					}
					System.out.println("Which student would you like to learn more about? (Enter a number between 1 and 20)");
					
					//Scan for number assign to student name
					int input = sc.nextInt();
					sc.nextLine();
					
					//Try catch is in a loop to check and see if input is from 1- 20
					while (input > 20 || input < 1) {
						try {
							throw new ArrayIndexOutOfBoundsException();
						} catch (ArrayIndexOutOfBoundsException e) {
							System.out.println("That student does not exist.  Please try again. (enter a number between 1-20)");
							input = sc.nextInt();
							sc.nextLine();
						}
					}//End 2nd While Loop
					
					// Sets a variable named personSelected to the index that corresponds with the index #
					String personSelected = names[input - 1][0];
					String factInput = " ";

					System.out.println("Student " + (input) + " is " + personSelected
							+ ". What would you like to know about " + personSelected
							+ "? (Hometown or favorite food)");

					//Needed factInput because I needed to scan for a String
					factInput = sc.nextLine();
					
					//While Loop to continue if it gets caught in try catch statement
					while (input <= 20 && input >= 1) {
						
						// if user select hometown and assign to index # in the array
						if (factInput.equalsIgnoreCase("hometown")) {
							System.out.println(personSelected + "'s hometown is "
									+ names[input - 1][1]
									+ ". Would you like to know more?");
							String choice1 = sc.nextLine();
							if (choice1.equalsIgnoreCase("yes")) {
								System.out.println("Please enter hometown or favorite food");
								factInput = sc.nextLine();
								continue;
							} else {
								break;
							}
						} else if (factInput.equalsIgnoreCase("favorite food")) {
							System.out.println(personSelected + "'s favorite food is "
									+ names[input - 1][2]
									+ ". Would you like to know more?");
							String choice1 = sc.nextLine();
							if (choice1.equalsIgnoreCase("yes")) {
								System.out.println("Please enter hometown or favorite food");
								factInput = sc.nextLine();
								continue;
							} else {
								break;
							}
							
							//Throw exception if they type in anything else outside of hometown or favorite food
						} else {
							try {
								throw new IllegalArgumentException();
							} catch (IllegalArgumentException e) {
								System.out.println("That data does not exist. Please try again. Enter hometown or favorite food");
								factInput = sc.nextLine();
							}

						}
					}//End 3rd While Loop
					//Ask user input
					System.out.println("Continue? (yes/no)");

					choice = sc.nextLine();
				}//End 1st While Loop
				System.out.println("Good Bye!");
				sc.close();//Close scanner

		// TODO Auto-generated method stub

	}//Close method

}//Close class
