package main;

import charaterPackage.Player;
/**
 * Main class of the project, he initiate a dungeon.
 * @author Pereira and Despelchin
 *
 */
public class Main {
	/**
	 * Initiate a game
	 * @param args - arguments array
	 */
	public static void main(String[] args) {
		System.out.println("=======================================================================================================================================\r\n" +
				"     _          _                          _                                   ____                                                 \r\n" + 
				"    / \\      __| | __   __   ___   _ __   | |_   _   _   _ __    ___          |  _ \\   _   _   _ __     __ _    ___    ___    _ __  \r\n" + 
				"   / _ \\    / _` | \\ \\ / /  / _ \\ | '_ \\  | __| | | | | | '__|  / _ \\         | | | | | | | | | '_ \\   / _` |  / _ \\  / _ \\  | '_ \\ \r\n" + 
				"  / ___ \\  | (_| |  \\ V /  |  __/ | | | | | |_  | |_| | | |    |  __/         | |_| | | |_| | | | | | | (_| | |  __/ | (_) | | | | |\r\n" + 
				" /_/   \\_\\  \\__,_|   \\_/    \\___| |_| |_|  \\__|  \\__,_| |_|     \\___|         |____/   \\__,_| |_| |_|  \\__, |  \\___|  \\___/  |_| |_|\r\n" + 
				"                                                                                                       |___/                        \r\n" + 
				"=======================================================================================================================================\r\n\r\n\r\n");
		System.out.println("Welcome to the dungeon ! You will have to make your way through it and find the exit !\n\n" +
				"In order to do this, you will have to make some choices among a list of several action which are : \n" +
				"\t-Look : Permit to look around yourself to analyse the room, see the monsters, the items and your stats.\n" +
				"\t-Use : Permit to use different items like health potion, strength potion, gold bag and more...\n" +
				"\t-Attack : Permit to attack monsters but be careful if you don't kill a monster in a single blow, he will hit you back.\n\n" +
				"Good luck, and may the force be with you !:)\n\n\n\n");
		AdventureGame adventureGame = new AdventureGame();
		Player player = new Player("You", adventureGame, 100, 40, 20);
		adventureGame.play(player);
		}
}
