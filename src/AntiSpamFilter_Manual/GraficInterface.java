package AntiSpamFilter_Manual;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.text.JTextComponent;

public class GraficInterface {
	
		private JButton buttonValidar;
		private JTextArea areaForLink;
		private JButton pathToSpamButton;
		private JButton pathToHamButton;
		private JButton buttonGravar;
		private JTextField spamTextField;
		private JTextField hamTextField;
		private JTextField rulesTextField;
		private JButton pathToRulesButton;
		private JTextArea areaForWeight;

		public GraficInterface() {
			JFrame janela = new JFrame("Spam Filter Manual");

			spamTextField = new JTextField();
			spamTextField.setEditable(true);
			hamTextField = new JTextField();
			hamTextField.setEditable(true);
			rulesTextField = new JTextField();
			rulesTextField.setEditable(true);
			rulesTextField.setPreferredSize(new Dimension(50, 30));

		}

	}	
