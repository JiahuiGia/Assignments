import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DeleteElemetJUnitTest {

	@Test
	public void test() {
		Assignment3 d = new Assignment3();
		int[]array = new int[10];
		array[0] = 0;
		array[1] = 1;
		array[2] = 77;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		array[6] = 6;
		array[7] = 7;
		array[8] = 9;
		array[9] = 10;
		int[] result = d.deleteElement(array, 3);
		int[] expectedResult = {0,1,77,4,5,6,7,9,10};
		Assert.assertArrayEquals(expectedResult, result);
	}

}
