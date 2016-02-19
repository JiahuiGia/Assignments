import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class AddDigitsJUnitTest {

	@Test
	public void test() {
		Assignment2 a = new Assignment2();
		int result1 = a.addDigits(78899);
		int expectedResult1 = 5;
		Assert.assertEquals(expectedResult1, result1);
		
		int result2 = a.addDigits(198);
		int expectedResult2 = 9;
		Assert.assertEquals(expectedResult2, result2);
		
		int result3 = a.addDigits(6);
		int expectedResult3 = 6;
		Assert.assertEquals(expectedResult3, result3);
	}

}
