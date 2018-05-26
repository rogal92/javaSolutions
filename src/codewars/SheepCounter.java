package codewars;

import java.util.Arrays;

public class SheepCounter {
	public int countSheeps(Boolean[] arrayOfSheeps) {
		return (int) Arrays.stream(arrayOfSheeps).filter(s -> s == true).count();
	}
}
