package codewars;

public class DigPow {
    public static void main(String[] args) {
        int n = 46288;
        int p = 3;
        long result = digPow(n, p);
        System.out.println(result);
    }
    public static long digPow(int n, int p) {

        int[] digits = changeToArray(n);
        int sum = 0;
        int result = 0;

        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], p + i);
        }
        if (sum % n == 0)
        	result = sum / n;

        return result > 0 ? result : -1;
    }

    public static int[] changeToArray(int n) {
        String str = String.valueOf(n);
        int[] numbers = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            numbers[i] = str.charAt(i) - '0';
        }
        return numbers;
    }
}
//
//public class DigPow {
//	  
//	  public static long digPow(int n, int p) {
//	    String intString = String.valueOf(n);
//	    long sum = 0;
//	    for (int i = 0; i < intString.length(); ++i, ++p)
//	      sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
//	    return (sum % n == 0) ? sum / n : -1;
//	  }
//	  
//	}
