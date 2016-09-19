/*Johnny Robinson
cygnuz007@hotmail.com

*/


import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class BattingAverageStats {
	
	
	public static void main(String[] args) {
		
		
		 Scanner scan = new Scanner(System.in);
	        DecimalFormat decimalFormat = new DecimalFormat("0.000");
	        int timesAtBat;
	        int atBatResult;
	        int totalScore = 0;
	        
	        System.out.println("Welcome to Batting Average Calculator!");
	        System.out.println("\n0=out, 1=single, 2=double, 3=triple, 4=home run");
	        
	        System.out.print("Enter number of times at bat: ");
	        timesAtBat=scan.nextInt();
	        
	        ArrayList<Integer> inputs = new ArrayList<Integer>();
	        for(int i=0; i< timesAtBat; i++) {
	            System.out.print("Result for at-bat "+i+":"+"\t");
	            atBatResult = scan.nextInt();
	            totalScore +=atBatResult;
	            inputs.add(atBatResult);
		
		
		// TODO Auto-generated method stub

	}

}
}