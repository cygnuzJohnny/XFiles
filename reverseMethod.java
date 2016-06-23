import java.util.Scanner;

/**Johnny Robinson
 * 313-600-3155
 */


/**A method for reverse a number using recursion
 * If the user enters 12345, the number will be converted to 54321
 *
 */
public class reverseMethod {

	
	
	
	public static void reverseMethod(int number) {
		if (number < 10) {
			   System.out.println(number);
			   return;

			}
		else {
			System.out.print(number % 10);
        
        reverseMethod(number / 10);
        
		}
	   }
	   public static void main(String args[])
	   {
		int num=0;
		System.out.println("Input your number and press enter: ");
		
		//Create Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Wait for the user to enter something
		num = input.nextInt();
		System.out.print("Reverse of the input number is:");
		reverseMethod(num);
		System.out.println();
	   }

}
