package codewars;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JosephusSurvivor {
	
	public static int josephusSurvivor(int n, int k) {
		int tempPos = k - 1;
		int[] peopleArr = new int[n];
		for (int i = 0; i < n; i++) {
			peopleArr[i] = i + 1;
		}
		
		int iteration = n - 1;
		List<Integer> list = IntStream.of(peopleArr)
											.boxed()
											.collect(Collectors.toList());
		
		while(iteration > 0) {
			list.remove(tempPos);
			tempPos += k - 1;
			if (tempPos > list.size() - 1) {
				tempPos %= list.size();
			}
			iteration--;
		}
		return list.get(0);
	}
}
