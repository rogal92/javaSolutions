
package main.trie.practise;

import java.util.Arrays;
import java.util.List;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(
                pigIt("Is pig Latin cool ?")
        );
    }

    public static String pigIt(String str) {
        List<String> list = Arrays.asList(str.split(" "));
        String result = "";
        for (String word: list) {
            if (word.matches("[a-zA-Z]+")) {
                String firstChar = String.valueOf(word.charAt(0));
                result += word.substring(1).concat(firstChar).concat("ay ");
            } else {
                result += word;
            }
        }
        return result.trim();
    }
}
