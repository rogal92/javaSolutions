package dayDictionary;

import java.util.HashMap;
import java.util.Map;

public class Spanish implements MapProvider {
	private Days days = new Days();
	private Map<String, String> dictionaryESP = new HashMap<>();
	
	@Override
	public Map<String, String> getTheMap() {
		dictionaryESP.put(days.getMonday(), "EL LUNES");
		dictionaryESP.put(days.getTuesday(), "EL MARTES");
		dictionaryESP.put(days.getWednesday(), "EL MIERCOLES");
		dictionaryESP.put(days.getThursday(), "EL JUEVES");
		dictionaryESP.put(days.getFriday(), "EL VIERNES");
		dictionaryESP.put(days.getSaturday(), "EL SABADO");
		dictionaryESP.put(days.getSunday(), "EL DOMINGO");
		
		return dictionaryESP;
	}
}
