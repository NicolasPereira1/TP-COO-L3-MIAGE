package filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Despelchin and Pereira
 * Repertory filter.
 */
public class FileFilter {
	private File file;
	
	/**
	 * Filter constructor
	 * @param name - the name of the directory to check
	 */
	public FileFilter(String name) {
		this.file = new File(name);
	}
	
	/**
	 * Apply a filter for the directory, by an implemenented filter.
	 * @param filter - the filter to use
	 * @return a String table of the Filtered files.
	 */
	public String [] applyFilter(FilenameFilter filter) {
		return file.list(filter);
	}
}
