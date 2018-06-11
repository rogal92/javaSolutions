package codewars;

import java.util.Arrays;

public class AlternatingSplit {

    public static void main(String[] args) {
        String text = "Ala ma kota";
        int n = 10;
        String result = encrypt(text,n);
        System.out.println(result);
    }

    public static String encrypt(final String text, final int n) {

        String temp = text;
        for (int i = 0; i < n ; i++) {
            temp = iterate(temp);
        }
        return temp;
    }

    public static String iterate(String text) {
        String evenCh = "";
        String oddCh = "";

            for (int j = 1; j < text.length() ; j = j + 2) {
                oddCh += text.charAt(j);
                String one = oddCh;
            }
            for (int h = 0; h < text.length(); h = h + 2) {
                evenCh += text.charAt(h);
            }
            text = oddCh + evenCh;
        return text;
    }
}
