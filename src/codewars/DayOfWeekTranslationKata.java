package codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayOfWeekTranslationKata {
	
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String day = "";
		  String language = "";
		  
		  System.out.println("Input day:");
		  day = sc.nextLine();
		  System.out.println("Input language:");
		  language = sc.nextLine();
		  
		  translate(day, language);
	}

	public static String translate(String day, String language) {
		  
		  final Map<String, String> engToFrench = new HashMap<>();
		  final Map<String, String> engToGer = new HashMap<>();
		  final String Monday = "Monday";
		  final String Tuesday = "Tuesday";
		  final String Wednesday = "Wednesday";
		  final String Thursday = "Thursday";
		  final String Friday = "Friday";
		  final String Saturday = "Saturday";
		  final String Sunday = "Sunday";

		  
		  engToFrench.put(Monday, "LUNDI");
		  engToFrench.put(Tuesday, "MARDI");
		  engToFrench.put(Wednesday, "MERCREDI");
		  engToFrench.put(Thursday, "JEUDI");
		  engToFrench.put(Friday, "VENDREDI");
		  engToFrench.put(Saturday, "SAMEDY");
		  engToFrench.put(Sunday, "DIMANCHE");
		  
		  engToGer.put(Monday, "MONTAG");
		  engToGer.put(Tuesday, "DIENSTAG");
		  engToGer.put(Wednesday, "MITTWOCH");
		  engToGer.put(Thursday, "DONNERSTAG");
		  engToGer.put(Friday, "FREITAG");
		  engToGer.put(Saturday, "SAMSTAG");
		  engToGer.put(Sunday, "SONNTAG");
		  
		
		  if (language.equals("French")) {
			  for (Map.Entry<String, String> entry : engToFrench.entrySet()) {
				  if (day.equals(entry.getKey())) {
					  System.out.println(entry.getValue());
				  }
			  }
		  } else if (language.equals("German")) {
			  for (Map.Entry<String, String> entry : engToGer.entrySet()) {
				  if (day.equals(entry.getKey())) {
					  System.out.println(entry.getValue());
				  }
			  }
		  } else {
			  throw new IllegalArgumentException();
		  }
	        return null;
	}
}
