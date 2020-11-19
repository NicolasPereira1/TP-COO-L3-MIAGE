package plugin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;

import event.FileEvent;
import event.FileListener;

/**
 * Emitter classe of the events. (Observable)
 * @author Despelchin and Pereira
 * 
 */
public class FileChecker implements ActionListener {
	private String pathname;
	private FilenameFilter filter;
	private ArrayList<String> lastFiles;
	private ArrayList<FileListener> listeners;

	/**
	 * Observable constructor
	 * @param pathname - the path of the directory to observe
	 * @param filter - the filter to apply on.
	 */
	public FileChecker(String pathname, FilenameFilter filter) {
		this.pathname = pathname;
		this.filter = filter;
		this.lastFiles = new ArrayList<String>();
		this.listeners = new ArrayList<FileListener>();
	}

	/**
	 * check if an action if performed on an event action.
	 */
	public void actionPerformed(ActionEvent e) {
		check();
	}
	
	/***
	 * Add a listeners to this observer
	 * @param listener - the listener to add
	 */
	public void addListener(FileListener listener) {
		this.listeners.add(listener);
	}
	
	/**
	 * Remove a listener to this observer
	 * @param listener - the listener to remove
	 */
	public void removeListener(FileListener listener) {
		this.listeners.remove(listener);
	}
	
	/**
	 * Create and propagate the 'added' event to all the listeners
	 * @param e - the FileEvent to use
	 */
	private void fireFileAdd(FileEvent e) {
		for(FileListener l : listeners)
			l.fileAdded(e);
	}

	/**
	 * Create and propagate the 'removed' event to all the listeners
	 * @param e - the FileEvent to use
	 */
	private void fireFileRemove(FileEvent e) {
		for(FileListener l : listeners)
			l.fileRemoved(e);
	}

	/**
	 * Get the list of included Files of a directory
	 * @return the list of Files
	 */
	private String[] getListOfFilesFromDir() {
		File pluginDirectory = new File(pathname);
		String[] dotClass = pluginDirectory.list(filter);
		return dotClass;
	}

	/**
	 * Check if an event occurs in a known file.
	 */
	public void check() {
		String[] allPlugins = getListOfFilesFromDir();
		for(String s : allPlugins) {
			if(!lastFiles.contains(s)) {
				fireFileAdd(new FileEvent(s));
				lastFiles.add(s);
			}
		}
		for(int i=0; i<lastFiles.size(); i++) {
			if(!Arrays.asList(allPlugins).contains(lastFiles.get(i))) {
				fireFileRemove(new FileEvent(lastFiles.get(i)));
				lastFiles.remove(i);
				i--;
			}
		}
	}
}
