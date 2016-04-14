
public class SumArrayTestDrive {

	public static void main(String[] args) {
		
		Assignment3 s = new Assignment3();
		
		int[] array = new int [5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 0;
		array[3] = -10;
		array[4] = -30;
		
		int result = s.sumArray(array);
		
		System.out.println(result);

	}
}