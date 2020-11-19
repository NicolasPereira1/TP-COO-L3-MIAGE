package event;

import java.util.EventObject;

/**
 * @author Despelchin and Pereira
 * Event emit when a new file is added in a repertory
 */
public class FileEvent extends EventObject{
	/**
	 * Memorise the name of the concerned File.
	 * @param name the concerned-event File
	 */
	public FileEvent(String name) {
		super(name);
	}
}
