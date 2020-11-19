package ihm;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
/**
 * radio panel with the "Yes or No" choice
 *@author Despelchin and Pereira
 *
 */
public class AnswerPanelRadio extends AnswerPanel{
	private JRadioButton yesButton;
	private JRadioButton noButton;
	/**
	 * construct a radio panel with the "Yes or No" choice
	 */
	public AnswerPanelRadio() {
		super();
		//Same for Yes No answer and Choice answser -> May use a for each
		yesButton = new JRadioButton("Yes");
		noButton = new JRadioButton("No");
		yesButton.addActionListener(new ExclusionActionListener(noButton));
		noButton.addActionListener(new ExclusionActionListener(yesButton));
		panel.setLayout(new BorderLayout());
		panel.add(yesButton, BorderLayout.NORTH);
		panel.add(noButton, BorderLayout.SOUTH);
	}

	@Override
	public String getValue() {
		if(yesButton.isSelected()) return "yes";
		if(noButton.isSelected()) return "no";
		return "false";
	}
	
	private class ExclusionActionListener implements ActionListener{
		private JRadioButton button;
		
		public ExclusionActionListener(JRadioButton button) {
			this.button = button;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			button.setSelected(false);
		}
		
		
	}
}
