//Given an array of numbers (a list in groovy), determine whether the sum of all of the numbers is odd or even.
//
//Give your answer in string format as 'odd' or 'even'.
//
//If the input array is empty consider it as: [0] (array with a zero).
//
//Example:
//
//oddOrEven([2, 5, 34, 6]) returns "odd".
//Have fun!

package codewars;

import java.util.Arrays;

public class AddOrEven {
	 public static String oddOrEven (int[] array) {
		return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
		  }
}
