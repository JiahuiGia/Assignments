import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CompareVersionJUnitTest {

	@Test
	public void test() {
		Assignment4 c = new Assignment4();
		
		String v11 = "1.2.3.0";
		String v12 = "1.2.4";
		
		int result1 = c.compareVersion(v11, v12);
		int expectedResult1 = -1;
		Assert.assertEquals(expectedResult1, result1);
		
		String v21 = "1.2.4.0";
		String v22 = "1.2.4";
		
		int result2 = c.compareVersion(v21, v22);
		int expectedResult2 = 0;
		Assert.assertEquals(expectedResult2, result2);
		
		String v31 = "1.2.5";
		String v32 = "1.2";
		
		int result3 = c.compareVersion(v31, v32);
		int expectedResult3 = 1;
		Assert.assertEquals(expectedResult3, result3);
		
	}

}
