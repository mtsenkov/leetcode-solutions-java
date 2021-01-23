package SelfDividingNumbers;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SelfDividingNumbersTest {

	@Test
	public void selfDividingNumbersTest() {
	
//		Input: 
//			left = 1, right = 22
//			Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
		List<Integer> actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8 ,9, 11, 12, 15, 22);
		SelfDividingNumbers t = new SelfDividingNumbers();
		List<Integer> result = t.selfDividingNumbers(1,22);
		assertEquals(result, actual);
	}
	

}
