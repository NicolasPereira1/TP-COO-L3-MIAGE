package ihm;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import quiz.Question;
import quiz.Quiz;
import quiz.QuizFactory;

/**
 * Graphical displayer of the game
 * @author Despelchin and Pereira
 *
 */
public class GraphicalDisplayer {
	
	/**
	 * Create a frame for the quiz
	 * @param quiz - the quiz to transform on IHM
	 */
	public void createFram(Quiz quiz) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(600, 650);
		frame.setLocation(700, 200);

		JPanel framePanel = new JPanel();
		framePanel.setLayout(new GridLayout(0,1));
		
		FinishButtonActionListener finishButtonActionListener = new FinishButtonActionListener(quiz.getListQuestion());
		for(Question q : quiz.getListQuestion()) {
			AnswerPanel answerPanel = AnswerPanelFactory.getInstance().createAnswerPanel(q.getAnswer());
			finishButtonActionListener.getListAnswerPanel().add(answerPanel);
			JPanel questionPanel = new JPanel();
			questionPanel.add(new Label(q.getQuestionText() + " " + q.getInstruction()));
			questionPanel.add(answerPanel.getPanel());
			framePanel.add(questionPanel);
		}

		JButton finishButton = new JButton("Finish");
		finishButton.addActionListener(finishButtonActionListener);
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(finishButton);
		frame.add(buttonPanel, BorderLayout.SOUTH);

		frame.add(framePanel);
		frame.setVisible(true);
	}
}
