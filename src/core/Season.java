package core;

/**
 * An enumeration of all the season of the game
 * @author Julien
 * @author Tristan
 */
public enum Season {
	Spring ("Printemps"),
	Summer ("Été"),
	Fall ("Automne"),
	Winter ("Hiver");
	
	/**
	 * A parameter with the name of the season
	 */
	private final String name;
	
	/**
	 * Create a new season with a name
	 * @param str : A string with the name of the season
	 */
	Season(String str) {
		this.name = str;
	}
	
	/**
	 * Return the name of the season
	 * @return name : The name of the season 
	 */
	public String toString() {
		return name;
	}
}
