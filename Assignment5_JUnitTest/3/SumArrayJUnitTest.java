import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SumArrayJUnitTest {

	@Test
	public void test() {
		Assignment3 s = new Assignment3();
		
		int[] array = new int [5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 0;
		array[3] = -10;
		array[4] = -30;
		int result = s.sumArray(array);
		int expectedResult = -10;
		Assert.assertEquals(expectedResult, result);
	}

}
