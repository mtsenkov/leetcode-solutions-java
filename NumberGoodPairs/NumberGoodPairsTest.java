package NumberGoodPairs;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberGoodPairsTest {

	
//	Input: nums = [1,2,3,1,1,3]
//	Output: 4
	@Test
	public void maximumWealthTest() {
		NumberGoodPairs t = new NumberGoodPairs();
//		int result = t.numIdenticalPairs(new int[] {
//				1, 2, 3, 1, 1, 3
//		});
		int result = t.numIdenticalPairs(new int[] {
				1, 1, 1, 1,
		});
		assertEquals(4, result);
	}
	

}
