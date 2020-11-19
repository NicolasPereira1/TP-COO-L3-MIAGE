package filter;

import java.io.File;
import java.io.FilenameFilter;
/**
 * @author Despelchin and Pereira
 * Filter for files which begins by the letter 'C'
 */
public class FilterC implements FilenameFilter{
	
	/**
	 * Accept a file if it begins by a 'C'.
	 * @param dir - the directory of the file to check
	 * @param name - the name of the file to check
	 * @return true if the name begins by a 'C', false if not.
	 */
	public boolean accept(File dir, String name) {
		return name.charAt(0) == 'C';
	}

}
