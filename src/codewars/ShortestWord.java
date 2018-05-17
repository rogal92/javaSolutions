package codewars;

import java.util.Arrays;

public class ShortestWord {
	public static void main(String[] args) {
		String s = "Ala ma kota kot ma Ale";
		int result = findShort(s);
		System.out.println(result);
	}
	public static int findShort(String s)
	  {
		String[] array = s.split(" ");
		Arrays.sort(array, (s1, s2) -> s1.length() - s2.length());
		return array[0].length();
	  }
}
//import java.util.stream.*;
//public class Kata {
//    public static int findShort(String s) {
//        return Stream.of(s.split(" "))
//          .mapToInt(String::length)
//          .min()
//          .getAsInt();
//    }
//}