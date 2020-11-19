package plugin;

public class RemoveVowelsPlugin implements Plugin {
	private final static String LABELLE = "Delete vowels";

	public String transform(String s) {
		return s.replaceAll("[a|e|i|o|u|y|A|E|I|O|U|Y]", "");
	}

	public String getLabel() {
		return LABELLE;
	}

	public String helpMessage() {
		return "Remove vowels into a text";
	}

}
