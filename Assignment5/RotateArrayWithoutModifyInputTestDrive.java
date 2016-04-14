import java.util.Arrays;

public class RotateArrayWithoutModifyInputTestDrive {

	public static void main(String[] args) {
		Assignment5 r = new Assignment5();
		int[] testArray = {6,7,9,8,2,3};
		int[] result = r.rotateArrayWithoutModifyInput(testArray);
		
		String originalString = Arrays.toString(testArray);
		System.out.println(originalString);
		String resultString = Arrays.toString(result);
		System.out.println(resultString);
	}

}
