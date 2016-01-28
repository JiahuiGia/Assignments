import java.util.Arrays;

public class FibonacciNumbersTestDrive {

	public static void main(String[] args) {
		
		Assignment2 f = new Assignment2();
		
		int[] result = f.fibonacciNumber(9);
		String resultString = Arrays.toString(result);
		
		System.out.println(resultString);

	}

}
