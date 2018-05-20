package codewars;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Routes {
	
	public static void main(String[] args) {
		String[][] arr = {{"USA", "BRA"}, {"UAE", "JPN"}, {"BRA","UAE"}};
		String result = findRoutes(arr);
		System.out.println(result);
		}
		

	  public static String findRoutes(String[][] routes) {
		  
		  final Map<String, String> fromTo = new HashMap<>();
		  for (final String[] route : routes) fromTo.put(route[0], route[1]);
		  
		  final Set<String> froms = new HashSet<>(fromTo.keySet());
		  froms.removeAll(fromTo.values());
		  String place = froms.iterator().next();
		  
		  String str = place;
		  while (true) {
			  place = fromTo.get(place);
			  if (place == null) break;
			  str += ", " + place;
		  }
		return str;
	  }
}
