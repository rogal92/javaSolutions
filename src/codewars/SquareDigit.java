package codewars;

public class SquareDigit {
//	public int squareDigits(int n) {
//		return Integer.parseInt(String.valueOf(n)
//				.chars()
//				.map(i -> Integer.parseInt(String.valueOf((char) i)))
//				.mapToObj(String::valueOf)
//				.collect(Collectors.joining("")));
//	}
	
	public int squareDigits(int n) {
		StringBuilder sb = new StringBuilder();
		String num = String.valueOf(n);
		for (char c : num.toCharArray()) {
			int cur = c - '0';
			cur *= cur;
			sb.append(cur);
		}
		return Integer.valueOf(sb.toString());
	}
}
