import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CountDigitsJUnitTest {

	@Test
	public void test() {
		
		Assignment3 c = new Assignment3();
		
		int result1 = c.countDigits(100);
		int expectedResult1 = 1;
		Assert.assertEquals(expectedResult1, result1);
		
		int result2 = c.countDigits(-100);
		int expectedResult2 = -1;
		Assert.assertEquals(expectedResult2, result2);
	}

}
