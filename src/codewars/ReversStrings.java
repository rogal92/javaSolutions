package codewars;

public class ReversStrings {
	 public static String reverseWords(String str){
		 
	     String[] array = str.split(" ");		
	     StringBuilder sb = new StringBuilder();
	     
			for (int i = array.length - 1; i >= 0; i--) {
				sb.append(array[i] + " ");
			}
			sb.delete(sb.length() - 1, sb.length());
			System.out.println(sb.toString());
	    return "";
	   }
	public static void main(String[] args) {
		reverseWords("Ala ma kota a kot ma ale");
	}
}
