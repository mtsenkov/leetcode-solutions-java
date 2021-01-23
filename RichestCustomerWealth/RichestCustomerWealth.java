package RichestCustomerWealth;

public class RichestCustomerWealth {
	public int maximumWealth(int[][] accounts) {
		int richest = 0;
		
		for(int i = 0; i < accounts.length; i++) {
			int curr = 0;
			for(int j = 0; j < accounts[i].length; j++) {
				System.out.println(accounts[i][j]);
				curr += accounts[i][j];
				System.out.println(curr);
			}
			if(richest < curr)
				richest = curr;
		}
		return richest;
//        throw new IllegalArgumentException("No solution.");
    }
}
