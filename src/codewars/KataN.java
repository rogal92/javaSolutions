package codewars;

public class KataN {
	static String result = "";
	static String str = "DFJKMNR";

	public static void main(String[] args) {
		String next = toLeetSpeak(str);
		System.out.println(next);
	}
	static String toLeetSpeak(final String speak) {
		String result = "";
		str = speak;
		
		char[] array = str.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 'A') {
				array[i] = '@';
				result += array[i];
			} else if (array[i] == 'B') {
				array[i] = '8';
				result += array[i];
			} else if (array[i] == 'C') {
				array[i] = '(';
				result += array[i];
			} else if (array[i] == 'E') {
				array[i] = '3';
				result += array[i];
			} else if (array[i] == 'G') {
				array[i] = '6';
				result += array[i];
			} else if (array[i] == 'H') {
				array[i] = '#';
				result += array[i];
			} else if (array[i] == 'I') {
				array[i] = '!';
				result += array[i];
			} else if (array[i] == 'L') {
				array[i] = '1';
				result += array[i];
			} else if (array[i] == 'O') {
				array[i] = '0';
				result += array[i];
			} else if (array[i] == 'S') {
				array[i] = '$';
				result += array[i];
			} else if (array[i] == 'T') {
				array[i] = '7';
				result += array[i];
			} else if (array[i] == 'Z') {
				array[i] = '2';
				result += array[i];
			} else {
				result += array[i];
			}
		}
		return result;
	}
}
