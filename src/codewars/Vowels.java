package codewars;

public class Vowels {
	public static void main(String[] args) {
		String str = "ala ma kota a kot ma ale";
		int result = getCount(str);
		System.out.println(result);
	}
	public static int getCount(String str) {
	    int vowelsCount = 0;
	    char[] array = str.toCharArray();
	    char[] vowels = {'a','e','i','o','u'};
	    
	    for (int i = 0; i < array.length; i++) {
	    	for (int j = 0; j < vowels.length; j++) {
	    		if (array[i] == vowels[j]) 
	    			vowelsCount++;
	    	}
	    }
	    return vowelsCount;
	  }
}
