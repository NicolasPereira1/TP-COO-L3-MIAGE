package plugin;

public class PluginToUpperCase implements Plugin{
	private final static String LABELLE = "Charater to upper case";
	public String transform(String s) {
		return s.toUpperCase();
	}

	public String getLabel() {
		return LABELLE;
	}

	public String helpMessage() {
		return "Transform charatere into uppercase charatere";
	}

}
