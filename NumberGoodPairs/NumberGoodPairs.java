package NumberGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class NumberGoodPairs {
//	public int numIdenticalPairs(int[] nums) {
//		int valid = 0;
//		for(int i = 0; i < nums.length; i++) {
//			for(int j = i + 1; j < nums.length; j++) 
//				if(nums[i] == nums[j]) valid++;
//			
//		}
//		return valid;
//    }
	
	public int numIdenticalPairs(int[] nums) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		int valid = 0;
		for(int i = 0; i < nums.length; i++) {
			if(m.containsKey(nums[i])) 
				valid += m.get(nums[i]);
			m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
		}
		return valid;
    }
	
}
