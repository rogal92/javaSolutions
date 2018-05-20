package codewars;

import java.util.Arrays;

public class Smallest {
	public static int findSmallestInt(int[] args) {
		return Arrays.stream(args).min().getAsInt();
    }
}
