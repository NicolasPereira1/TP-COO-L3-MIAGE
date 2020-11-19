package plugin;

import java.io.File;
import java.io.FilenameFilter;
import filter.FilterClass;

/**
 * Filter for plugins
 * @author Despelchin and Pereira
 *
 */
public class PluginFilter implements FilenameFilter{

	public boolean accept(File dir, String name) {
		FilterClass fc = new FilterClass();
		if(!fc.accept(dir, name)) return false;
		
		try {
			name = name.substring(0, name.length()-6);
			Class<?> cl = Class.forName("plugin." + name);
			if(!Plugin.class.isAssignableFrom(cl)) return false;
		} catch (ClassNotFoundException e) {
			return false;
		}
		return true;
	}
}
