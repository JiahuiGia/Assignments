import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class IsPrimeNumberJUnitTest {

	@Test
	public void test() {
		Assignment2 i = new Assignment2();
		
		boolean result1  = i.isPrimeNumber(99);
		boolean expectedResult1 = false;
		//The method assertEquals(boolean, boolean) from the type Assert is deprecated
		Assert.assertEquals(expectedResult1, result1);
		//The method assertTrue(boolean) from the type Assert is deprecated
		Assert.assertTrue(expectedResult1==result1);
		
		boolean result2  = i.isPrimeNumber(2);
		boolean expectedResult2 = true;
		Assert.assertEquals(expectedResult2, result2);
		
		boolean result3  = i.isPrimeNumber(-33);
		boolean expectedResult3 = false;
		Assert.assertEquals(expectedResult3, result3);
	}

}
