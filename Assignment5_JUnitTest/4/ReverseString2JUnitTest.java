import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseString2JUnitTest {

	@Test
	public void test() {
		Assignment4 r = new Assignment4();
		
		String str = "Anna likes football very much";
		String result = r.reverseString2(str);
		String expectedResult = "much very football likes Anna";
		Assert.assertEquals(expectedResult, result);
	}

}
