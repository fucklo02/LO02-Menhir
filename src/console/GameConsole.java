package console;

import core.Rules;
import java.util.Scanner;
import launcher.Main;

public class GameConsole {
	
	/**
	 * 
	 */
    private static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }  
	}
    
    /**
     * 
     * @return
     */
    private static int getIntFromConsole() {
       	Scanner sc = new Scanner(System.in);
    	int input = 0;

    		try {
    			input = sc.nextInt();
    		} catch (Exception e) {
    			System.out.print("Error: Vous devez rentrez un entier! ");
    		}

    	//sc.close();
    	return input;
    }
    
    /**
     * 
     */
    //private Playable partie;
    private Rules rules;
    private int nbPlayers;
    private int nbIAPlayers;
    private String season;
    private String actualPlayer;
    private String targetPlayer;
    //private IAPlayer ia;
    //private ArrayList<Player> playerList;
    //private Round currentRound;
    
    /**
     * 
     */
    public GameConsole() {
    	//GameConsole.clearConsole();
    	System.out.println("\n------------------------------------");
    	System.out.println("+     Nouvelle partie de Menhir    +");
    	System.out.println("------------------------------------");
    	this.chooseRules();
    	this.chooseNumberPlayer();
    	this.chooseNumberIA();
    }
    
    /**
     * 
     */
    private void chooseRules() {
    	System.out.println("\rVoulez vous jouer avec les (1) règles simples ou les (2) règles avancèes?");
    	int result;
    	
    	do {
    		result = GameConsole.getIntFromConsole();
    		if ((result != 1 && result != 2)) {
    			System.out.println("(Veuillez choisir entre 1 et 2)");
    		} else {
    			this.rules = (result == 1) ? Rules.Simple : Rules.Advance;
    			System.out.println("Vous avez choisi: " + this.rules);
    		}
    	} while (this.rules == null);
    }
    
    /**
     * 
     */
    private void chooseNumberPlayer() {
    	System.out.println("\rVeuillez choisir le nombre de joueurs.");
    	int result;
    	
    	do {
    		result = GameConsole.getIntFromConsole();
    		if (result < 1) {
    			System.out.println("Vous ne pouvez pas entrer ce nombre!");
    		} else if (result == 1) {
    			System.out.println("Vous ne pouvez pas jouer seul!");
    		} else if (result > 6) {
    			System.out.println("Vous ne pouvez pas être plus de 6 joueurs!");
    		} else {
    			this.nbPlayers = result;
    		}
    	} while (this.nbPlayers < 1 || this.nbPlayers > 6);
    }
   
    /**
     * 
     */
    private void chooseNumberIA() {
    	System.out.println("Combien de joueur seront des joueurs virtuels?");
    	int result;
    	int nbMax = this.nbPlayers - 1;
    	
    	do {
    		result = GameConsole.getIntFromConsole();
    		if (result < 0) {
    			System.out.println("Veuillez entre un nombre de joueurs supérieur ou égale à zéro.");
    		} else if (result > nbMax) {
    			System.out.println("Il ne peut pas y avoir que des joueurs virtuels.");
    		} else {
    			this.nbPlayers = result;
    		}
    	} while (result < 0 || result > nbMax);
    }
    
    
}
