import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class LengthOfLastWordJUnitTest {

	@Test
	public void test() {
		Assignment4 l = new Assignment4();
		
		String str = "qwe ssssssss trtrvs  ";
		int result = l.lengthOfLastWord(str);
		int expectedResult = 6;
		Assert.assertEquals(expectedResult, result);
		
	}

}
