package dayDictionary;

import java.util.HashMap;
import java.util.Map;

public class Process {
	
	public void translate(String day, Map<String, String> map) {
		String translation = "";
		for(Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getKey().equalsIgnoreCase(day)) {
				translation = entry.getValue().toUpperCase();
				System.out.print("Translation is: " + translation);
			}
		}
	}
}
