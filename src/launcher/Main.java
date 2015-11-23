package launcher;

import java.io.Console;
import console.GameConsole;
import java.util.Scanner;

public class Main {
	
	/**
	 * Lanceur de l'application: Jeu du Menhir
	 */
	public static void main(String[] args) {
		/* TODO Auto-generated method stub
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		Console console = System.console();
		
		if (console != null) {
			new GameConsole();
		} else {
			System.out.println("GUI non fonctionnel ... Lancement en mode console!");
			new GameConsole();
		}
	}

}
