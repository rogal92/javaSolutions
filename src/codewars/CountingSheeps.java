package codewars;

public class CountingSheeps {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(countingSheep(num));
    }
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += String.valueOf(i) + " sheep...";
        }
        return result;
    }
}
