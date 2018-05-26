package codewars;

import java.util.stream.Stream;

public class ReverseOrder {
	public static void main(String[] args) {
		long n = 348597;
		int[] result = digitize(n);
		System.out.println(result);
	}
	 public static int[] digitize(long n) {
		 return new StringBuilder().append(n)
				 .reverse()
				 .chars()
				 .map(Character::getNumericValue)
				 .toArray();
	 }
}