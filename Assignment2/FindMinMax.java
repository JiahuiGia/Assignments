import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		
		Assignment2 f = new Assignment2();
		
		int[]numbers = new int [10];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 77;
		numbers[3] = 3;
		numbers[4] = 4;
		numbers[5] = 5;
		numbers[6] = 6;
		numbers[7] = 7;
		numbers[8] = -8;
		numbers[9] = 9;
		
		int[] result = f.findMinMax(numbers);
		String resultString = Arrays.toString(result);
		
		System.out.println(resultString);

	}

}
