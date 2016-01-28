import java.util.Arrays;

public class ChenkGradeTestDrive {

	public static void main(String[] args) {
		
		Assignment2 c = new Assignment2();
		int[] scores = new int[4];
		scores[0] = 12;
		scores[1] = 88;
		scores[2] = 61;
		scores[3] = 44;
		
		int[] result = c.checkGrade(scores);
		String resultString = Arrays.toString(result);
		
		System.out.println(resultString);
		
	}

}
