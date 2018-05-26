
//Well met with Fibonacci bigger brother, AKA Tribonacci.
//
//As the name may already reveal, it works basically like a Fibonacci,
//but summing the last 3 (instead of 2) numbers of the sequence to generate the next
package codewars;

public class Tribonacci {
	public static void main(String[] args) {
		double[] result = {0,1,1};
		int n = 10;
		double[] r = tribonacci(result, n);
		for (double d : r)
			System.out.println((int)d);
	}
	  public static double[] tribonacci(double[] s, int n) {
		  double[] array = new double[n];
		  for (int i = 0; i < array.length; i++)
			array[i] = (i < 3) ? s[i] : array[i - 3] + array[i - 2] + array[i - 1];
		return array;
	  }
}
