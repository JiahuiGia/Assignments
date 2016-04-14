import java.util.Arrays;

public class DeleteElementTestDrive {

	public static void main(String[] args) {
		
		Assignment3 d = new Assignment3();
		
		int[]array = new int[10];
		array[0] = 0;
		array[1] = 1;
		array[2] = 77;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		array[6] = 6;
		array[7] = 7;
		array[8] = 9;
		array[9] = 10;
		
		int[] result = d.deleteElement(array, 3);
		
		String arrayString = Arrays.toString(array);
		String resultString = Arrays.toString(result);
		
		System.out.println(arrayString);
		System.out.println(resultString);
	}

}
