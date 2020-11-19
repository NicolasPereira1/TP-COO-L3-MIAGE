package ihm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import quiz.Question;

public class FinishButtonActionListener implements ActionListener {
	private List<AnswerPanel> listAnswerPanel;
	private List<Question> listQuestion;
	
	public FinishButtonActionListener(List<Question> lisQuestions) {
		this.listAnswerPanel = new ArrayList<AnswerPanel>();
		this.listQuestion = lisQuestions;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int points = calculatPoints();
		if(points == 0)
			JOptionPane.showMessageDialog(null,"Unfortunately you scored 0 point. :(\nYou can try again if you want ! :)");
		else if(points<10)
			JOptionPane.showMessageDialog(null,"Well played, you scored " + points +" points ! :D");
		else
			JOptionPane.showMessageDialog(null,"Amazing ! You scored " + points +" points !\nThis is the maximum ! :D");
	}

	private int calculatPoints() {
		int points = 0;
		for(int i=0; i<listQuestion.size(); i++) {
			Question question = listQuestion.get(i);
			question.setUserAnswer(listAnswerPanel.get(i).getValue());
			if(question.isUserAnswerCorrect())
				points += question.getNbPoints();
		}
		return points;
	}
	/**
	 * @return the listAnswerPanel
	 */
	public List<AnswerPanel> getListAnswerPanel() {
		return listAnswerPanel;
	}
	/**
	 * @param listAnswerPanel the listAnswerPanel to set
	 */
	public void setListAnswerPanel(List<AnswerPanel> listAnswerPanel) {
		this.listAnswerPanel = listAnswerPanel;
	}

}
