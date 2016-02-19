import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CheckGradeJUnitTest {

	@Test
	public void test() {
		Assignment2 c = new Assignment2();

		int[] scores = new int[5];
		scores[0] = 95;
		scores[1] = 88;
		scores[2] = 73;
		scores[3] = 61;
		scores[4] = 43;

		int[] result = c.checkGrade(scores);
		int[] expectedResult = { 4, 3, 2, 1, 0 };

		Assert.assertArrayEquals(expectedResult, result);
	}

}
