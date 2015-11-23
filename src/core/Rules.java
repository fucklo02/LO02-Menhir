package core;

/**
 * An enumeration of the two type of rules (game) available
 * @author Julien
 * @author Tristan
 */
public enum Rules {
	Simple ("R�gles simples"),
	Advance ("R�gles Avanc�es");

	/**
	 * A parameter with the name of the rule
	 */
	private final String name;
	
	/**
	 * Create a new rule with a name
	 * @param str : A string with the name of the rule
	 */
	Rules(String str) {
		this.name= str;
	}
	
	/**
	 * Return the name of the rule
	 * @return name : The name of the rule
	 */
	public String toString() {
		return name;
	}
}

	
	
	