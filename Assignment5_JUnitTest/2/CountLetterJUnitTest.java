import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CountLetterJUnitTest {

	@Test
	public void test() {
		Assignment2 c = new Assignment2();
		String str = "aaabbbccccdddeeeff";
		char letter = 'g';
		int result = c.countLetter(str, letter);
		int expectedResult = 0;
		Assert.assertEquals(expectedResult, result);
		Assert.assertTrue(result==expectedResult);
	}

}
