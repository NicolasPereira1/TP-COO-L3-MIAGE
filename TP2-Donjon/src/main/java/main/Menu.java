package main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Generic type to display menus during the game
 * @author Despelchin and Pereira
 *
 * @param <T> - It can be monsters, actions, items, etc...
 */
public class Menu<T> {
	/**
	 * Choose an element in a list of object of type T.
	 * @param list - the list to display
	 * @return the chosen element by the player.
	 */
	public T chose(List<T> list) {
		displayMenu(list);
		int scanner = readInt(list.size()+1);
		if(scanner==0) return null;
		clearTheScreen();
		System.out.println("--------------------------------------------");
		return list.get(scanner-1);
	}
	/**
	 * Display the list
	 * @param list - the list to display on screen.
	 */
	private void displayMenu(List<T> list) {
		int cpt = 1;
		System.out.print("You choose (1-" + list.size() + ") ?\n");
		for (T t : list) {
			System.out.println(cpt++ +" - "+ t.toString());
		}
	}
	
	/**
	 * Read the player's choice
	 * @param n - The maximun number the player can choose
	 * @return the player's choice
	 */
	private int readInt(int n) {
		Scanner scanner = new Scanner(System.in);
		int input = -1;
		while (input <= 0 || input >= n) {
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException	 e){
				// consume the input (that is not an integer)
				scanner.skip(".*");
			}
		}
		return input;
	}

	private void clearTheScreen() {
		for(int i=0; i<50; i++)
			System.out.println();
	}
}
