package core;

import java.util.*;

public class CardAlly extends Card {
	
	private static final int NB_CARD_MAX = 6;
	
	private static int nbAllyCards;
	
	private static ArrayList<CardAlly> stack = new ArrayList<CardAlly>();
	
	private int[] matrix;

	public CardAlly() {
		// TODO Auto-generated constructor stub
	}

	public CardAlly(int[] matrix, CardName name) {
		super(null, null);
	}

}
