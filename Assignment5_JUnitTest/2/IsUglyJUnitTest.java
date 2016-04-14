import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class IsUglyJUnitTest {

	@Test
	public void test() {
		Assignment2 i = new Assignment2();
		boolean result1 = i.isUgly(300);
		boolean expectedResult1 = true;
		Assert.assertEquals(expectedResult1, result1);
		
		boolean result2 = i.isUgly(1);
		boolean expectedResult2 = true;
		Assert.assertEquals(expectedResult2, result2);
		
		boolean result3 = i.isUgly(42);
		boolean expectedResult3 = false;
		Assert.assertEquals(expectedResult3, result3);
	}

}
