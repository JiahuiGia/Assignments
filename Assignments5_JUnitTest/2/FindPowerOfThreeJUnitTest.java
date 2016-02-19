import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FindPowerOfThreeJUnitTest {

	@Test
	public void test() {
		Assignment2 f = new Assignment2();
		int[] result1 = f.findPowerOfThree(5);
		int[] expectedResult1 = {1,3,9,27,81};
		Assert.assertArrayEquals(expectedResult1, result1);
		
		int[] result2 = f.findPowerOfThree(0);
		int[] expectedResult2 = {};
		Assert.assertArrayEquals(expectedResult2, result2);
	}

}
