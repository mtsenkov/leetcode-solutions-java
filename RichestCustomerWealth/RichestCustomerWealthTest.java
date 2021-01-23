package RichestCustomerWealth;

import static org.junit.Assert.*;

import org.junit.Test;

public class RichestCustomerWealthTest {

	@Test
	public void maximumWealthTest() {
		RichestCustomerWealth t = new RichestCustomerWealth();
		int res = t.maximumWealth(new int[][] {
			{1, 5},
			{7, 3},
			{3, 5},
		});
		assertEquals(10, res);
	}
	

}
