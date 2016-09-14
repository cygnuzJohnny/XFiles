import java.lang.Math;



public class Die {
	private int sides;
	private int roll;

	//Create constructor
	public Die() {
		sides = 0;
		roll = 0;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public int getSides() {
		return sides;
	}

	public int rollDice(int s) {
		roll = (int) Math.ceil(Math.random() * sides);
		return roll;

	}
}//Close out class