package codewars;

public class MathOperations {
	
	public static void main(String[] args) {
		int a = 20;
		int b = 4;
		String operator = "substract";
		int result = arithmetic(a,b,operator);
		System.out.println(result);
	}
	public static int arithmetic(int a, int b, String operator) {
		switch (operator) {
		case "add":
			return a + b;
			
		case "subtract":
			return a - b;
			
		case "multiply":
			return a * b;

		case "divide":
			return a / b;
		}
		return 0;
	  }
}
