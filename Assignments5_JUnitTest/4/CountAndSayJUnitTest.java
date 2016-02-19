import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CountAndSayJUnitTest {

	@Test
	public void test() {
		Assignment4 c =new Assignment4();
		
		String str = "aabbffccffzz";
		
		String result = c.countAndSay(str);
		String expectedResult = "2a2b2c4f2z";
		Assert.assertEquals(expectedResult, result);
	}

}
