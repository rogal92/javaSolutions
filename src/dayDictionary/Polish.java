package dayDictionary;

import java.util.HashMap;
import java.util.Map;

public class Polish implements MapProvider {
	private Days days = new Days();
	private Map<String, String> dictionaryPL = new HashMap<>();
	
	@Override
	public Map<String, String> getTheMap() {
		dictionaryPL.put(days.getMonday(), "Poniedziałek");
		dictionaryPL.put(days.getTuesday(), "Wtorek");
		dictionaryPL.put(days.getWednesday(), "Środa");
		dictionaryPL.put(days.getThursday(), "Czwartek");
		dictionaryPL.put(days.getFriday(), "Piątek");
		dictionaryPL.put(days.getSaturday(), "Sobota");
		dictionaryPL.put(days.getSunday(), "Niedziela");
		
		return dictionaryPL;
	}
}
