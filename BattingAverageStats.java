/*Johnny Robinson
cygnuz007@hotmail.com
APP will Calculate batting statistics
*/

import java.util.Scanner;


public class BattingAverageStats {

	public static void main(String[] args) {
		
		//Create Scanner
		Scanner scan = new Scanner(System.in);

		//Enter While Loop
		while (true) {
			
			System.out.println("Welcome to Batting Average Calculator!");
			System.out.print("Enter number of times at bat: ");
			
			//User input number at bat
			int n = scan.nextInt();

			//Create new int array
			int[] atBats = new int[n];

			System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
			
			//Enter for loop
			for (int i = 0; i < n; i++) {
				System.out.print("Result for at-bat " + i + ": ");
				
				//User input number of times at bat
				atBats[i] = scan.nextInt();
				
				//Enter While Loop if invalid user input 
				while (atBats[i] < 0 || atBats[i] > 4) {
					System.out.print("Invalid entry.  Please try again.  Result for at-bat " + i + ": ");
					atBats[i] = scan.nextInt();

					// TODO Auto-generated method stub

				}//Close invalid (2nd) while loop 

			}//Close for loop

			//Declare and initialize int variables
			int hits = 0;
			int totalBases = 0;
			for (int i : atBats) {
				if (i > 0)
					hits++;
				totalBases += i;

			}//Close for loop
			
			//Calculate batting average
			double battingAvg = (double) hits / n;
			double sluggingPct = (double) totalBases / n;

			System.out.printf("Batting Average: %.3f \n", battingAvg);
			System.out.printf("Slugging Percentage: %.3f \n", sluggingPct);

			System.out.println("Another batter? (y/n):");
			
			// clear out newline left by nextDouble
			scan.nextLine(); 
			
			//Create string variable name answer
			String answer = scan.nextLine();
			char firstLetter = answer.toUpperCase().charAt(0);
			while (firstLetter != 'Y' && firstLetter != 'N') {
				System.out.print("Invalid entry.  Please try again.  Continue? (y/n) ");
				answer = scan.nextLine();
				firstLetter = answer.toUpperCase().charAt(0);

			}//Close invalid (3rd)  while loop

			if (firstLetter == 'N')
				break;

		}//Close 1st while loop
		
		
		scan.close();//Close Scanner
		System.out.println("Thank you!");
	}//Close main method
}//Close class
