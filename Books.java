
/*Johnny Robinson
cygnuz007@hotmail.com
Mid-Term Library*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Books {

	public static void main(String[] args) {
		/*
		 * java.util.ArrayList<String> authorString, titleString, statusString,
		 * due_dateString;
		 */

		int author = 0;
		int books;
		int title;
		int status;
		int due_date;
		int[] values;
		values = new int[5];

		// Create scanner object
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println("Enter Author or Title Name");
		choice = sc.nextLine();
		String value = sc.nextLine();

		String[] list = { "author", "title", "status", "due date" };
		sc.nextLine();

		String authorString = "author";
		if (list[0] == (authorString)) {
			System.out.println("Author");
		}
		
			String titleString = "title";
		if (list[2] == (titleString)) {
			System.out.println("title");
		}

		String statusString = "Status";
		if (list[3] == (statusString)) {
			System.out.println("Status");

		String due_dateString = "Due_Date";
		if (list[4] == (due_dateString)) {
			System.out.println("Due_Date");
			}

		String[] in = { "author", "title", "status", "due date" };
		System.out.println(in);
		sc.nextLine();

			for (int i = 0; i < 4; i++) {
				// System.out.println(authorString + titleString +
				// due_dateString
				// sc.nextInt();
			}

			// ArrayList<Author> authorString = new ArrayList<Author>();
			// ArrayList<Title>titleString = new ArrayList<Title>();
			// ArrayList<Status>statusString = new ArrayList<Status>();
			// ArrayList<Due_Date>due_dateString = new ArrayList<Due_Date>();

			// List all Authors, Titles, and Due Dates
			switch (author) {

			case 1:
				authorString = "Philip K. Dick";
				titleString = "Do Androids Dream of electric sheep?";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 2:
				authorString = "Ray bradbury";
				titleString = "Something Wicked This Way Comes.";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 3:
				authorString = "Douglas Adams";
				titleString = "The Hitchhikers";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 4:
				authorString = "Seth Graham";
				titleString = "Pride and Prejudice";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 5:
				authorString = "Sloane Croley";
				titleString = "I was told There'd Be Cake.";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 6:
				authorString = "Mark Hudson";
				titleString = "The Curious Incident of the Dog in the Night.";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 7:
				authorString = "Robert Rankin";
				titleString = "The Hollow";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 8:
				authorString = "Lynn Trust";
				titleString = "Eats, Shoots & Leaves";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 9:
				authorString = "Harper Lee";
				titleString = "To Kill a Mocking Bird";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 10:
				authorString = "Milan Kundera";
				titleString = "The Unberable Lightness of Being";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 11:
				authorString = "Chelsea Handler";
				titleString = "Are You There, Vodka?";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;
			case 12:
				authorString = "Johnn Berendt";
				titleString = "Midnight in Garden of Good and Evil";
				due_dateString = "July 26, 2016";
				System.out.println("Author: " + authorString + titleString + due_dateString);
				break;

			default:
				authorString = "Status";
				System.out.println("checked out");
				System.out.println("on shelf");
				break;

			// System.out.println(authorString + titleString + due_dateString);

			}

		}

		}
		
	}


