package codewars;

import java.util.Arrays;

public class FindOdd {
	public static void main(String[] args) {
		int[] arr = {2,2,3,3,4,5,5,6,6,7,7};
		int result = findIt(arr);
		System.out.println(result);
	}
	public static int findIt(int[] A) {
		int odd = 0;
		int counter;
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++) {
			counter = 0;
			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j]) {
					counter++;
				}
			}
			if (counter % 2 != 0) {
				odd = A[i];
				break;
			}
		}
	  	return odd;
	  }
}
