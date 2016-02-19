import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CountWordsJUnitTest {

	@Test
	public void test() {
		
		Assignment4 c = new Assignment4();
		
		String str1 = "";
		int result1 = c.countWords(str1);
		int expectedResult1 = 0;
		Assert.assertEquals(expectedResult1, result1);
		
		String str2 = "asafdf adsafa";
		int result2 = c.countWords(str2);
		int expectedResult2 = 2;
		Assert.assertEquals(expectedResult2, result2);
		
		String str3 = "   asdsa  adsdf afasf  ";
		int result3 = c.countWords(str3);
		int expectedResult3 = 3;
		Assert.assertEquals(expectedResult3, result3);
	}

}
