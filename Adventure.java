import java.util.Scanner;


//Johnny Robinson
//Adventure Game
//APP prompts user to choose between 2 options

public class Adventure {

	public static void main(String[] args) {

		String name;
		String choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome! What is your name?");
		name = scan.nextLine();
		System.out.println();

		System.out.println("Would you like to play a game? (y/n)");
		choice = scan.nextLine();
		System.out.println();

		if (choice.equalsIgnoreCase("y")) {
			System.out.println("Excellent, " + name + "! You are walking across a field and you encounter a"
					+ " fire-breathing dragon! What would you do? (enter face the beast or run away )");

			choice = scan.nextLine();
			System.out.println();

			if (choice.equalsIgnoreCase("face the beast")) {
				System.out.println("You approach the dragon. You see that it has _ heads. (enter 1 or 2 or 3)");
				choice = scan.nextLine();
				System.out.println();

				if (choice.equalsIgnoreCase("3")) {
					System.out.println(
							name + ", no one has dared face a 3-headed dragon before! What a noble and brave adventurer you are! Choose your weapon"
									+ " (enter slingshot or sword or bow and arrow): ");

					choice = scan.nextLine();
					System.out.println();

					if (choice.equalsIgnoreCase("bow and arrow")) {
						System.out.println(
								"Armed with your bow and arrow you approach the dragon. You feel its fiery breath as you appraoch."
										+ " It stares at you with its ___ eyes. (enter red or blue) ");

						choice = scan.nextLine();
						System.out.println();

						if (choice.equalsIgnoreCase("red")) {
							System.out.println(
									"Red-eyed dragons are the rarest dragons known to man. These are friendly beasts, you pet the dragon and become friends."
											+ " Choose a name for your new friend. (enter a name):");

							choice = scan.nextLine();
							System.out.println();

							System.out.println(name + " and " + choice
									+ " lived on to see many great adventures together! The end.");
						} else if (choice.equalsIgnoreCase("blue")) {
							System.out.println("Blue-eyed dragons are the most fearsome creatures known to man."
									+ " No one stands a chance against them, not even a brave adventurer like you, "
									+ name + ". The drangon engulfs you in flame.");
						}
					} else if (choice.equalsIgnoreCase("sword")) {
						System.out.println(
								name + ", a young adventurer of your stature and experience cannot expect to weild a sword against such a formidable foe!"
										+ " You have chosen poorly and paid the ultimate price!");
					} else if (choice.equalsIgnoreCase("slingshot")) {
						System.out.println("A fools choice, " + name
								+ "! Your hubris has gotten the best of you this time, the drangon makes mincemeat out of you!");
					}
				} else if (choice.equalsIgnoreCase("2")) {
					System.out.println(
							"2-headed dragons are most dangerous! You made a poor choice and have paid the cost as the dragon swallows you whole.");
				} else if (choice.equalsIgnoreCase("1")) {
					System.out.println("Hmmm...many 1-headed dragons have been slayed in adventures past, " + name
							+ ". They now fear humans, the dragon will fly away upon sight of you! Perhaps you are the not the great adventurer I thought you were.");
				}
			} else if (choice.equalsIgnoreCase("run away")) {
				System.out.println("You are a coward, " + name + "! I shall seek another worthy of this adventure!");
			}

		} else {
			System.out.println(name + ", you truly do not possess the adventurer's spirit. GAME OVER!");
		}
		scan.close();

		// TODO Auto-generated method stub

	}

}
