package codewars;

public class Scrambles {
    public static void main(String[] args) {
        String str1 = "javsscripts";
        String str2 = "javascript";
        boolean result = scramble(str1, str2);
        System.out.println(result);
    }
    public static boolean scramble(String str1, String str2) {

        String match = "";
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    match += str1.charAt(j);
                    str1 = str1.replace(str1.charAt(j), ' ');
                    break;
                }
            }
        }
        return match.equals(str2) ? true : false;
    }
}