package event;

public class SimplePluginObserver implements FileListener {

	@Override
	public void fileAdded(FileEvent e) {
		System.out.println("New plug-in added : " + e.getSource());
	}

	@Override
	public void fileRemoved(FileEvent e) {
		System.out.println("Plug-in removed : " + e.getSource());		
	}

}