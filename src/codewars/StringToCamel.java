
//Complete the method/function so that it converts dash/underscore delimited
//        words into camel casing. The first word within the output should be
//        capitalized only if the original word was capitalized.
//
//        Examples
//
//        toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
//
//        toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"


package codewars;

public class StringToCamel {
    public static void main(String[] args) {
        String s = "the_stealth_warrior";
        String res = toCamelCase(s);
        System.out.println(res);
    }

    static String toCamelCase(String s) {
        String result = "";
        String[] arr = s.split("[-_]");
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }
        for (String str : arr) result += str;
        return result;
    }
}

