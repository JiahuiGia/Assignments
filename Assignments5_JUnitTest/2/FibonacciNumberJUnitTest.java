import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberJUnitTest {

	@Test
	public void test() {
		Assignment2 f = new Assignment2();
		
		int[] result1 = f.fibonacciNumber(2);
		int[] expectedResult1 = {1,1};
		Assert.assertArrayEquals(expectedResult1, result1);
		
		int[] result2 = f.fibonacciNumber(0);
		int[] expectedResult2 = {};
		Assert.assertArrayEquals(expectedResult2, result2);
	}

}
