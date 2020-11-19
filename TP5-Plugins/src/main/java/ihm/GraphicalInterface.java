package ihm;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

import plugin.FileChecker;

/**
 * Graphical interface of the project
 * @author Despelchin and Pereira
 *
 */
public class GraphicalInterface extends JFrame{
	private JTextArea textarea;
	private FileChecker filechecker;
	
	public GraphicalInterface(FileChecker filechecker) {
		this.textarea = new JTextArea();
		this.filechecker = filechecker;
		this.setContentPane(createFram());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(creatMenu());
		this.pack();
		this.setLocation(500, 200);
		this.setVisible(true);
	}
	
	private JMenuBar creatMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu file = new JMenu("file");
		JMenuItem open = new JMenuItem("open");
		JMenu filtre = new JMenu("filtre");
		bar.add(filtre);
		
		file.add(open);
		bar.add(file);
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));
				int returnedValue = chooser.showOpenDialog(null);
				if(returnedValue == JFileChooser.APPROVE_OPTION) {
					try {
						BufferedReader buf = new BufferedReader(new FileReader(chooser.getSelectedFile().getPath()));
						String line = "";
						while((line = buf.readLine()) != null) {
							textarea.setText(textarea.getText() + line + "\n");
						}
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		bar.add(file);
		return bar;
	}
	
	private JPanel createFram() {
		JPanel framePanel = new JPanel();
		framePanel.setLayout(new FlowLayout());
		
		textarea.setPreferredSize(new Dimension(900, 625));
		framePanel.add(textarea);
		return framePanel;
	}
}
