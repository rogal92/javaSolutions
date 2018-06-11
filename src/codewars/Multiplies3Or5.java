package codewars;

public class Multiplies3Or5 {
    public static void main(String[] args) {
        int in = 10;
        System.out.println(solution(in));
    }
    public static int solution(int number) {
        int sum = 0;

        for (int i = 0; i <number ; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
