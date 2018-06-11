package codewars;

public class TripleTrouble {
    public static void main(String[] args) {
        long one = 12434449;
        long two = 23453422;
        int result = tripleTrouble(one,two);
        System.out.println(result);
    }
    public static int tripleTrouble(long num1, long num2) {

        String nOne = String.valueOf(num1);
        String nTwo = String.valueOf(num2);

        for (int i = 0; i <10 ; i++) {
            String n = String.valueOf(i);
            if (nOne.contains(n+n+n) && nTwo.contains(n+n))
                return 1;
        }
        return 0;
    }
}