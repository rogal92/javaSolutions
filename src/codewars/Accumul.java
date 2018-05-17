package codewars;

public class Accumul {
	public static void main(String[] args) {
		String s = "abc";
		String newS = accum(s);
		System.out.println(newS);
	}
    public static String accum(String s) {
        String str = "";
        
        for (int i = 0; i < s.length(); i++) {
        	str += s.toUpperCase().charAt(i);
        	
        	for (int j = 0; j < i; j++) {
        		str += s.toLowerCase().charAt(i);
        	}
        	
        	if (i != s.length() - 1) str += "-";
        }
        return str;
    }
}
