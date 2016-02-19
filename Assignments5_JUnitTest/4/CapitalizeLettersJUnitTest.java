import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;



public class CapitalizeLettersJUnitTest {

	@Test
	public void test() {
		Assignment4 c = new Assignment4();
		
		String str = "I like soccer very much";
		String result = c.capitalizeLetters(str);
		String expectedResult = "I Like Soccer Very Much";
		Assert.assertEquals(expectedResult, result);
	}

}
