package event;

import java.util.EventListener;

/**
 * @author Despelchin and Pereira
 * Listener interface for the events
 */
public interface FileListener extends EventListener{
	/**
	 * Listener when a File is added
	 * @param e - the FileEvent to listen
	 */
	public void fileAdded(FileEvent e);
	
	/**
	 * Listener when a File is removed
	 * @param e - the FileEvent to listen
	 */
	public void fileRemoved(FileEvent e);
}
