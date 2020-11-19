package filter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Despelchin and Pereira
 * Filter for files which ends by  '.class'
 */
public class FilterClass implements FilenameFilter{

	/**
	 * Accept a file if it ends by '.class'.
	 * @param dir - the directory of the file to check
	 * @param name - the name of the file to check
	 * @return true if the name begins by '.class', false if not.
	 */
	public boolean accept(File dir, String name) {
		return name.endsWith(".class");
	}

}
