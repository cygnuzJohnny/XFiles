import java.lang.Math;
import java.text.NumberFormat;



public class Circles {
	
	//Declare private variables for encapsulation
	private double radius;
	private static int count;

	//Create constructor name circles
	public Circles(double r) {
		radius = r;
		count++;
	}
	
	//Create method to get cirumference
	public double getCircumference() {
		return 2 * (Math.PI * radius);
	}

	public String getFormattedCircumference() {
		 return formatNumber(getCircumference());
	}

	//create method to get area
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	//Create method to format number
	private String formatNumber(double x) {
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);
		String formattedNumber = number.format(x);
		return formattedNumber; 
	}

	public static int getObjectCount() {
		return count;


}
}//Close class