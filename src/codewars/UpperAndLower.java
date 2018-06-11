package codewars;

public class UpperAndLower {
    public static void main(String[] args) {
        String s = "Ala MA koTa 222";
        String result = toAlternativeString(s);
        System.out.println(result);
    }
    public static String toAlternativeString(String string) {
        int length = string.length();
        StringBuilder sb = new StringBuilder();
        sb.append(string);

        for(int i = 0; i < length; i++) {
            Character c = sb.charAt(i);
            if (Character.isLowerCase(c))
                sb.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                sb.replace(i, i+1, Character.toLowerCase(c)+"");
        }
        string = sb.toString();
        return string;
    }
}
