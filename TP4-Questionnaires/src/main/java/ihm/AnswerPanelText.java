package ihm;

import java.awt.TextArea;
import java.awt.TextField;
/**
 * Text answer panel
 * @author Despelchin and Pereira
 *
 */
public class AnswerPanelText extends AnswerPanel{
	private TextField textField;
	/**
	 * Construct a textArea to the new panel
	 */
	public AnswerPanelText() {
		super();
		textField = new TextField(15);
		panel.add(textField);
	}

	@Override
	public String getValue() {
		return textField.getText();
	}
}
