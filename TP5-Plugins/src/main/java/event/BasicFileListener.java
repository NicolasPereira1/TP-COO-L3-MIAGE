package event;

/**
 * Basic filelistener.  Reacts whith a String when a event is emit.
 * @author Despelchin and Pereira
 */
public class BasicFileListener implements FileListener {

	/**
	 * Reaction when a file is added
	 * FileEvent e - the event to listen to
	 */
	public void fileAdded(FileEvent e) {
		System.out.println("New file added : " + e.getSource());
	}

	/**
	 * Reaction when a file is removed
	 * FileEvent e - the event to listen to
	 */
	public void fileRemoved(FileEvent e) {
		System.out.println("File has been deleted : " + e.getSource());
	}

}
