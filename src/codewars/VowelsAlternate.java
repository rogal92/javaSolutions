package codewars;

public class VowelsAlternate {
    public static void main(String[] args) {
        String word = "bubebibobu";
        boolean isAlt = isAlt(word);
        System.out.println(isAlt);
    }

    public static boolean isAlt(String word) {

        char[] vowels = {
            'a',
            'e',
            'i',
            'o',
            'u'
        };

        if (word.length() >= 3) {
            for (int i = 3; i <= word.length() - 1; i++) {
                for (int j = 0; j <= word.length() - 1; j++) {
                    if (word.charAt(i - 3) == vowels[j] && (word.charAt(i - 1) == vowels[j]) &&
                        (word.charAt(i - 2) != vowels[j])) {
                        return true;
                    } else if (word.charAt(i - 2) == vowels[j] && (word.charAt(i) == vowels[j]) &&
                        (word.charAt(i - 3) != vowels[j])) {
                        return true;
                    } 
                }
            }
        } else if (word.length() == 2) {
            for (char c: word.toCharArray()) {
                if ((word.charAt(0) == c && word.charAt(1) != c) || (word.charAt(0) != c && word.charAt(1) == c))
                    return true;
            }
        } else if (word.length() == 1) {
            return false;
        }
        return false;
    }
}