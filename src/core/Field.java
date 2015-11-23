package core;

/**
 * The class to create and use a field
 * @author Julien
 * @author Tristan
 */
public class Field implements Comparable<Field> {
	
	/**
	 * All the field parameters
	 */
	private int roundNbMenhirs;
	private int roundNbRocks;
	private int nbMenhirs;
	private int nbRocks;
	
	/**
	 * Create a field
	 */
	public Field() {
		this.roundNbMenhirs = 0;
		this.roundNbRocks = 0;
		this.nbMenhirs = 0;
		this.nbRocks = 0;
	}
	
	/**
	 * Add à given number of menhirs
	 * @param n : The number to add
	 */
	public void addMenhir(int n) {
		nbMenhirs += n;
	}
	
	/**
	 * Add a given number of rocks
	 * @param n : The number to add
	 */
	public void addRock(int n) {
		nbRocks += n;
	}
	
	/**
	 * Compare two field 
	 * @param compareField : The compared field
	 * @return 
	 */
	public int compareTo(Field compareField) {
		if(this.roundNbMenhirs == compareField.roundNbMenhirs) {			
		return (compareField.roundNbRocks - this.roundNbRocks);	
		} else {
		return (compareField.roundNbMenhirs - this.roundNbMenhirs);
		}
	}
	
	/**
	 * Reset a field
	 */
	public void resetField() {
		this.nbMenhirs = 0;
		this.nbRocks = 0;
	}
	
	/**
	 * Return the number of menhirs on a field
	 * @return nbMenhirs : The number of menhirs
	 */
	public int getNbMenhir() {
		return nbMenhirs;
	}
	
	/**
	 * Return the number of rocks on a field
	 * @return nbRocks : The number of rocks
	 */
	public int getNbRock() {
		return nbRocks;
	}
	
	/**
	 * Save the number of Menhir(s) at the end of a round
	 */
	public void setRoundNbMenhir() {
		this.roundNbMenhirs = nbMenhirs;
	}
	
	/**
	 * Save the number of Rock(s) at the end of a round
	 */
	public void setRoundNbRock() {
		this.roundNbRocks = nbRocks;
	}
	
	/**
	 * Return a string to give information about a field
	 * @return str : The string who describe the field
	 */
	public String toString() {
		String str = "Champs : " + this.roundNbMenhirs + " menhirs et " + this.roundNbRocks + " graines.";  
		return str;
	}

}
