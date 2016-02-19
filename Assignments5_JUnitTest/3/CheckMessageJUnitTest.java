import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CheckMessageJUnitTest {

	@Test
	public void test() {
		Assignment3 c = new Assignment3();
		
		String str = "SOSSSSOOO";
		
		int result = c.checkMessage(str);
		int expectdeResult = 3;
		Assert.assertEquals(expectdeResult, result);
	}

}
