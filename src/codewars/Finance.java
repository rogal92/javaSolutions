package codewars;

import java.math.BigInteger;

public class Finance {
	public static void main(String[] args) {
		int n = 0;
		BigInteger result = finance(n);
		System.out.println(result);
	}
	public static BigInteger finance(int n) {
		long add = 0;
		long savings = 0;
		long total = 0;
		
		for (long i = 0; i < n; i++) {
			add += 3;
			savings += add;
			total += savings;
		}
		return BigInteger.valueOf(total);
	}
}
