import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FindDuplicatesJUnitTest {

	@Test
	public void test() {
		Assignment3 f = new Assignment3();
		int[] array1 = new int[10];
		array1[0] = 0;
		array1[1] = 1;
		array1[2] = 2;
		array1[3] = 3;
		array1[4] = 4;
		array1[5] = 5;
		array1[6] = 6;
		array1[7] = 7;
		array1[8] = 9;
		array1[9] = 10;
		boolean result1 = f.findDuplicates(array1);
		boolean expectedResult1 = false;
		Assert.assertEquals(expectedResult1, result1);

		int[] array2 = new int[10];
		array2[0] = 0;
		array2[1] = 1;
		array2[2] = 2;
		array2[3] = 3;
		array2[4] = 4;
		array2[5] = 5;
		array2[6] = 6;
		array2[7] = 7;
		array2[8] = 9;
		array2[9] = 9;
		boolean result2 = f.findDuplicates(array2);
		boolean expectedResult2 = true;
		Assert.assertEquals(expectedResult2, result2);
	}

}
