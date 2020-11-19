package ihm;

import javax.swing.JSpinner;

/**
 * The numerical answer panel
 * @author Despelchin and Pereira
 *
 */
public class AnswerPanelNumerical extends AnswerPanel{
	private JSpinner spinner;
	/**
	 * Construct a numerical panel
	 */
	public AnswerPanelNumerical(){
		super();
		spinner = new JSpinner();
		panel.add(spinner);
	}

	@Override
	public String getValue() {
		return ""+spinner.getValue();
	}
 }
