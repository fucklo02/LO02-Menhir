package core;

/**
 * An enumeration of all the actions available for a card (ally or ingredient)
 * @author Julien
 * @author Tristan
 */
public enum CardAction {
	Giant ("Géant"),
	Fertilizer ("Engrais"),
	Leprechaun ("Farfadet"),
	Taup ("Taupe"),
	Dog ("Chien");

	/**
	 * A parameter with the name of the action
	 */
	private final String name;
	
	/**
	 * Create a new card's action with a name
	 * @param str : The name of the action
	 */
	CardAction (String str) {
		this.name = str;
	}
	
	/**
	 * Return a string with the name of the action
	 * @return str : The name of the action
	 */
	public String toString() {
		return this.name;
	}
	
}
