import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseString1JUnitTest {

	@Test
	public void test() {
		Assignment4 r = new Assignment4();
		
		String str = " I like football ";
		String result = r.reverseString1(str);
		String expectedResult = " llabtoof ekil I ";
		Assert.assertEquals(expectedResult, result);
	}

}
