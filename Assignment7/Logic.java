package Assignment7;

public class Logic {

	private float currentNum;

	public Logic() {
		currentNum = 0;
	}

	public String getTotalString() {
		return "" + currentNum;
	}

	public void setTotal(String n) {
		currentNum = Float.parseFloat(n);
	}

	public void plus(String n) {
		currentNum += Float.parseFloat(n);
	}

	public void minus(String n) {
		currentNum -= Float.parseFloat(n);
	}

	public void multiply(String n) {
		currentNum *= Float.parseFloat(n);
	}

	public void divide(String n) {
		currentNum /= Float.parseFloat(n);
	}

	public void plusOrMinus(String n) {
		currentNum = Float.parseFloat(n) * (-1);
	}

	public void percent(String n) {
		currentNum = Float.parseFloat(n) / 100;
	}
}
