package dayDictionary;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		translate();
	}
	public static void translate() {			
		System.out.println("Please isert language and name of the day to translate: ");
		Translator translator = new Translator(sc.nextLine(), sc.nextLine());
		translator.process();
		System.out.println("\nTranslate again? Press 'y': ");
		tryAgain(sc.nextLine());
	}
	public static void tryAgain(String str) {
		switch(str) {
		case "y" :
			translate();
			break;
		}
	}
}
