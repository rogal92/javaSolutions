package codewars;

public class CalculateRotation {
    public static void main(String[] args) {
        String first = "coffee";
        String second = "bartek";
        int result = shiftedDiff(first, second);
        System.out.println(result);
    }
    static int shiftedDiff(String first, String second) {

        char last;
        StringBuilder sb = new StringBuilder();
        int counter = 0;

        if (first.equals(second)) {
            return counter;
        } else {
            for (int i = 0; i < first.length(); i++) {

                last = first.charAt(first.length() - 1);
                first = first.substring(0, first.length() - 1);
                sb.append(last).append(first);
                first = sb.toString();
                sb.setLength(0);
                counter++;

                if (first.equals(second)) {
                    return counter;
                }
            }
        }
        return -1;
    }
}