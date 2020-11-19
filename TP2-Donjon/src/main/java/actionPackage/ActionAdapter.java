package actionPackage;

import main.Menu;

/**
 * The Action adapter permit to adapt our action menu to the different kind of actions and her specifications.
 * @author Despelchin and Pereira
 * @param <T> - In which type did we use the action. It can be on a direction, a monster, an item or another action (nd. see the {UseAction.java}) 
 */
public abstract class ActionAdapter<T> implements Action {
	protected String name;
	protected Menu<T> menu;
	
	/**
	 * Define a Type for the menu of the action
	 * @param menu - The menu to use, nd. in which type we adapt it.
	 */
	public ActionAdapter (Menu<T> menu) {
		this.menu = menu;
	};
	
	/**
	 * ToString method. It return the name of this action adapter
	 */
	public String toString() {
		return name;
	}
}
