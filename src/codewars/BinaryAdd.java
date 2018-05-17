package codewars;

public class BinaryAdd {
	public static void main(String[] args) {
		int number = 12343434;
		int n = countBits(number);
		System.out.println(n);
	}
	public static int countBits(int n) {
//		Integer.toBinaryString(n).chars()
//		.filter(i -> i == '1')
//		.count();
		return Integer.bitCount(n);
		
	}
}
