package codewars;

import java.util.*;

public class ThrowingCoins {
    public static void main(String[] args) {
        int number = 11;
        coin(number);
        }

    public static String[] coin(int n) {
        String h = "H";
        String t = "T";
        List<String> strings = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbTwo = new StringBuilder();
        StringBuilder sbAdd = new StringBuilder();
        StringBuilder sbTwoAdd = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(h);
            sbTwo.append(t);
            sbAdd.append(h);
            sbTwoAdd.append(t);
        }
        strings.add(sb.toString());
        strings.add(sbTwo.toString());

        for (int i = 0; i < sb.length(); i++) {
            sb.deleteCharAt(i);
            sb.append(t);
            sbTwo.deleteCharAt(i);
            sbTwo.append(h);
            strings.add(sb.toString());
            strings.add(sbTwo.toString());
        }

        for (int i = 1; i < sb.length() ; i++) {
            sbAdd.replace(i -1, i,t);
            strings.add(sbAdd.toString());
            sbAdd.replace(i - 1, i,h);

            sbTwoAdd.replace(i - 1, i,h);
            strings.add(sbTwoAdd.toString());
            sbTwoAdd.replace(i - 1, i, t);
        }
//        ArrayList<String> results = new ArrayList<>();
//        results.addAll(strings);
        Collections.sort(strings);

              for(String stri : strings)
            System.out.println(stri);
        System.out.println(strings.size());

//        String[] array = results.toArray(new String[results.size()]);

        return new String[0];
    }
}

