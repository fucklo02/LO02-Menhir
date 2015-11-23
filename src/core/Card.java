package core;

import java.util.*;

/**
 * 
 *
 *
 */
public class Card {
	
	/**
	 * 
	 */
	public static final int NB_CARDS_MAX = 24;
	
	/**
	 * 
	 */
	private static ArrayList<Card> stack;

	/**
	 * 
	 */
	private int[][] matrix;

	/**
	 * 
	 */
	private CardName name;

	/**
	 * 
	 */
	private boolean isDrawed;
	
	/**
	 * 
	 */
	public static void initCards() {
		ArrayList<Card> stack = new ArrayList<Card>();

		/**
		 * Some matrix with the value of the different attributes for each card
		 */
		int[][] matrixMoon1 = {{1,1,1,1},{2,0,1,1},{2,0,2,0}};
		int[][] matrixMoon2 = {{2,0,1,1},{1,3,0,0},{0,1,2,1}};
		int[][] matrixMoon3 = {{0,0,4,0},{0,2,2,0},{0,0,1,3}};
		int[][] matrixMermaid1 = {{1,3,1,0},{1,2,1,1},{0,1,4,0}};
		int[][] matrixMermaid2 = {{2,1,1,1},{1,0,2,2,},{3,0,0,2}};
		int[][] matrixMermaid3 = {{1,2,2,0},{1,1,2,1},{2,0,1,2}};
		int[][] matrixDryad1 = {{2,1,1,2},{1,1,1,3},{2,0,2,2}};
		int[][] matrixDryad2 = {{0,3,0,3},{2,1,3,0},{1,1,3,1}};
		int[][] matrixDryad3 = {{1,2,1,2},{1,0,1,4},{2,4,0,0}};
		int[][] matrixFountain1 = {{1,3,1,2},{2,1,2,2},{0,0,3,4}};
		int[][] matrixFountain2 = {{2,2,0,3},{1,1,4,1},{1,2,1,3}};
		int[][] matrixFountain3 = {{2,2,3,1},{2,3,0,3},{1,1,3,3}};
		int[][] matrixGold1 = {{2,2,3,1},{2,3,0,3},{1,1,3,3}};
		int[][] matrixGold2 = {{2,2,2,2},{0,4,4,0},{1,3,2,2}};
		int[][] matrixGold3 = {{3,1,3,1},{1,4,2,1},{2,4,1,1}};
		int[][] matrixRainbow1 = {{4,1,1,1},{1,2,1,3},{1,2,2,2}};
		int[][] matrixRainbow2 = {{2,3,2,0},{0,4,3,0},{2,1,1,3}};
		int[][] matrixRainbow3 = {{2,2,3,0},{1,1,1,4},{2,0,3,2}};
		int[][] matrixSpirit1 = {{3,1,4,1},{2,1,3,3},{2,3,2,2}};
		int[][] matrixSpirit2 = {{2,4,1,2},{2,2,2,3},{1,4,3,1}};
		int[][] matrixSpirit3 = {{3,3,3,0},{1,3,3,2},{2,3,1,3}};
		int[][] matrixFairy1 = {{1,2,2,1},{1,2,3,0},{0,2,2,2}};
		int[][] matrixFairy2 = {{4,0,1,1},{1,1,3,1,},{0,0,3,3}};
		int[][] matrixFairy3 = {{2,0,1,3},{0,3,0,3},{1,2,2,1}};

		Card.stack.add(new Card(matrixMoon1, CardName.Moon1));
		Card.stack.add(new Card(matrixMoon2, CardName.Moon2));
		Card.stack.add(new Card(matrixMoon3, CardName.Moon3));
		Card.stack.add(new Card(matrixMermaid1, CardName.Mermaid1));
		Card.stack.add(new Card(matrixMermaid2, CardName.Mermaid2));
		Card.stack.add(new Card(matrixMermaid3, CardName.Mermaid3));
		Card.stack.add(new Card(matrixDryad1, CardName.Dryad1));
		Card.stack.add(new Card(matrixDryad2, CardName.Dryad2));
		Card.stack.add(new Card(matrixDryad3, CardName.Dryad3));
		Card.stack.add(new Card(matrixFountain1, CardName.Fountain1));
		Card.stack.add(new Card(matrixFountain2, CardName.Fountain2));
		Card.stack.add(new Card(matrixFountain3, CardName.Fountain3));
		Card.stack.add(new Card(matrixGold1, CardName.Gold1));
		Card.stack.add(new Card(matrixGold2, CardName.Gold2));
		Card.stack.add(new Card(matrixGold3, CardName.Gold3));
		Card.stack.add(new Card(matrixRainbow1, CardName.Rainbow1));
		Card.stack.add(new Card(matrixRainbow2, CardName.Rainbow2));
		Card.stack.add(new Card(matrixRainbow3, CardName.Rainbow3));
		Card.stack.add(new Card(matrixSpirit1, CardName.Spirit1));
		Card.stack.add(new Card(matrixSpirit2, CardName.Spirit2));
		Card.stack.add(new Card(matrixSpirit3, CardName.Spirit3));
		Card.stack.add(new Card(matrixFairy1, CardName.Fairy1));
		Card.stack.add(new Card(matrixFairy2, CardName.Fairy2));
		Card.stack.add(new Card(matrixFairy3, CardName.Fairy3));
		
		Collections.shuffle(stack);
	}
	
	public static void resetCards() {
		Card.stack.clear();
		Card.initCards();
		
		for(int i = 0; i <= NB_CARDS_MAX; i++) {
			Card.stack.get(i).setDrawed(false);
		}
	}

	/**
	 * Create a empty card without parameters
	 */
	public Card() {
	}
	
	/**
	 * Create a card with parameters
	 * @param matrix : All the value of a card
	 * @param name : The name of a card
	 */
	public Card(int[][] matrix, CardName name) {
		this.matrix = matrix;
		this.name = name;
		this.isDrawed = false;
	}
	
	/**
	 * 
	 */
	public void getCards() {
		return;
	}
	
	/**
	 * 
	 */
	public void getCardValue() {
		
	}
	
	/**
	 * 
	 */
	public void getCardName() {
		
	}
	
	/**
	 * 
	 * @param bool
	 */
	public void setDrawed(boolean bool) {
		this.isDrawed = false;
	}
	
	/**
	 * 
	 */
	public void drawCards() {
		
	}

}
