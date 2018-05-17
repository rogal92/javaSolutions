package codewars;

import java.util.Scanner;

public class PhoneNumber {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		String str = "";
		
		 numbers[0] = 1;
		 numbers[1] = 2;
		 numbers[2] = 3;
		 numbers[3] = 4;
		 numbers[4] = 5;
		 numbers[5] = 6;
		 numbers[6] = 7;
		 numbers[7] = 8;
		 numbers[8] = 9;
		 numbers[9] = 0;
		 
		 str = createPhoneNumber(numbers);
		 
		 System.out.println(str);
	}
	 public static String createPhoneNumber(int[] numbers) {
		 
		 StringBuilder sb = new StringBuilder();
		 String str = "";
		 for (int c : numbers) {
			 str += String.valueOf(c);
		 }
		 sb.append("(").append(str.substring(0,3)).append(") ").append(str.substring(3,6)).append("-")
		 .append(str.substring(6,10));

		return sb.toString();
	 }
}
