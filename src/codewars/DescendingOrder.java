package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DescendingOrder {
	 static String one = "";
	 static String two = "";
	 static String s = "";
	 static int numberOne;
	 static int numberTwo;
	 static int num;
	 
	public static void main(String[] args) {
		num = 1512110;
		sortDesc(num);
	}
	 public static int sortDesc(final int num) {
		 
			List<Integer> list = new ArrayList<>();
		 	s = String.valueOf(num);
		 			
			for (char c : s.toCharArray()) {
				int element = c - '0';
				list.add(element);
			}
			
			Integer[] array = new Integer[list.size()];
			list.toArray(array);
			
			Arrays.sort(array);
			
			for (int i = 0; i <= array.length -1; i++) {
				one += array[i];
				two += array[array.length - 1 - i];
			}
			
			numberOne = Integer.parseInt(one);
			numberTwo = Integer.parseInt(two);
			
			if (numberOne > numberTwo) {
				System.out.println(numberOne);
			} else {
				System.out.println(numberTwo);
			}
			return numberTwo;
	 }
}
