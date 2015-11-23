package core;

/**
 * The counting cards
 * @author Julien
 * @author Tristan
 */
public class Counting {
	
	/**
	 * All the counting cards' parameters
	 */
	private int menhirsSum;
	private int rocksSum;
	
	/**
	 * Create a counting cards
	 */
	public Counting() {
		this.menhirsSum = 0;
		this.rocksSum = 0;
	}
	
	/**
	 * Save the number of menhirs of a player
	 * @param field : The field who want to save the number of rocks
	 */
	public void saveMenhirs(Field field) {
		this.menhirsSum = field.getNbMenhir();
	}
	
	/**
	 * Save the number of rocks of a player
	 * @param field : The field who want to save the number of rocks
	 */
	public void saveRocks(Field field) {
		this.rocksSum = field.getNbRock();
	}
	
	/**
	 * Reset the card
	 */
	public void reset() {
		this.menhirsSum = 0;
		this.rocksSum = 0;
	}
	
	/**
	 * Return the number of menhirs write int the card
	 * @return menhirsSum : The final amout of menhir
	 */
	public int getMenhirsSum() {
		return this.menhirsSum;
	}
	
	/**
	 * Return the number of rocks write in the card
	 * @return rocksSum : The final amout of rock
	 */
	public int getRocksSum() {
		return this.rocksSum;
	}
	
	/**
	 * Return a description of the card
	 * @return str : The string who define the card
	 */
	public String toString() {
		String str = "Carte comptage : " + this.menhirsSum + " menhirs et " + this.rocksSum + " graines.";
		return str;
	}
}
