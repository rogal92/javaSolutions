//Given a set of numbers, return the additive inverse of each. 
//		Each positive becomes negatives, and the negatives become positives.
//

package codewars;

import java.util.Arrays;

public class InvertValues {
	  public static int[] invert(int[] array) {
		  return Arrays.stream(array).map(a -> a * -1).toArray();
	  }
}
