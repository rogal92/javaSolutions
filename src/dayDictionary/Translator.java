package dayDictionary;

public class Translator extends Process {
    private String language;
    private String day;
    private String str;
    private Process translator = new Process();

    public Translator(String language, String day) {
        this.language = language;
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public String getDay() {
        return day;
    }

    public void process() {
    	switch(language) {
    	case "Polish" :
    		translator.translate(day, new Polish().getTheMap());
    		break;
    	case "Spanish" :
    		translator.translate(day, new Spanish().getTheMap());
    		break;
    	}
    }
}