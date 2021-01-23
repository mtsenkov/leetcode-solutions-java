package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumbers {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		boolean isSelfDividing;
		for (int i = left; i <= right; i++) {
			isSelfDividing = true;
			if (!String.valueOf(i).contains("0")) {
				int num = i;
				while (num > 0) {
					if (i % (num % 10) != 0)
						isSelfDividing = false;
					num /= 10;
				}
				if (isSelfDividing)
					list.add(i);
			}

		}
		return list;
	}
}
