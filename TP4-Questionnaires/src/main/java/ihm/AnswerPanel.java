package ihm;

import javax.swing.JPanel;

/**
 * abstract class for an answer panel. It is used to create a swing panel  for a specific answer 
 * @author bDespelchin and Pereira
 *
 */
public abstract class AnswerPanel {
	protected JPanel panel;
	
	/**
	 * Creates a new panel
	 */
	public AnswerPanel() {
		this.panel = new JPanel();
	}

	/**
	 * Getter of the panel
	 * @return the panel of the Answer
	 */
	public JPanel getPanel() {
		return panel;
	}
	/**
	 * Get the answer choose
	 * @return the answer choose as a String
	 */
	public abstract String getValue();
	
}
