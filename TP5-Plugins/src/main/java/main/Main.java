package main;

import javax.swing.Timer;

import event.MenuPluginObserver;
import event.SimplePluginObserver;
import ihm.GraphicalInterface;
import plugin.FileChecker;
import plugin.PluginFilter;

/**
 * @author Despelchin and Pereira
 * Main class of the project.
 */
public class Main {
	/**
	 * Launch the project
	 * @param args - useless here
	 */
	public static void main(String[] args) {
		FileChecker fileChecker = new FileChecker("plugin", new PluginFilter());
		fileChecker.addListener(new SimplePluginObserver());
		fileChecker.addListener(new MenuPluginObserver());
		
		GraphicalInterface gi = new GraphicalInterface(fileChecker);
		
		Timer t = new Timer(1000, fileChecker);
		t.start();
		while(true);
	}
}