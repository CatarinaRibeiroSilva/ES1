package AntiSpamFilter_Manual;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

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
			JPanel gridPanelForTexts = new JPanel(new GridLayout(3, 1));
			gridPanelForTexts.add(rulesTextField);
			gridPanelForTexts.add(hamTextField);
			gridPanelForTexts.add(spamTextField);

			pathToSpamButton = new JButton("Open Spam file");
			pathToHamButton = new JButton("Open Ham file");
			pathToRulesButton = new JButton("Open Rules file");
			pathToHamButton.setPreferredSize(new Dimension(10, 30));

			JPanel gridPanelForButtons = new JPanel(new GridLayout(3, 1));
			gridPanelForButtons.add(pathToRulesButton);

			gridPanelForButtons.add(pathToHamButton);
			gridPanelForButtons.add(pathToSpamButton);
			
			JPanel linkAndButton = new JPanel(new BorderLayout());
			linkAndButton.add(gridPanelForTexts, BorderLayout.CENTER);
			linkAndButton.add(gridPanelForButtons, BorderLayout.EAST);

			areaForLink = new JTextArea();
			areaForLink.setEditable(false);

			areaForLink.setBackground(Color.WHITE);

			JScrollPane scroll1 = new JScrollPane(areaForLink);
			scroll1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scroll1.setPreferredSize(new Dimension(350, 300));

			areaForWeight = new JTextArea();
			areaForWeight.setFocusable(true);
			areaForWeight.setBackground(Color.WHITE);

			JScrollPane scroll2 = new JScrollPane(areaForWeight);
			scroll2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scroll2.setPreferredSize(new Dimension(50, 300));

			JPanel panelForTextArea = new JPanel();
			panelForTextArea.setSize(200, 200);
			panelForTextArea.add(scroll1, BorderLayout.WEST);
			panelForTextArea.add(scroll2, BorderLayout.EAST);

			buttonValidar = new JButton("Validar");
			buttonGravar = new JButton("Gravar");
			buttonGravar.setPreferredSize(new Dimension(75, 25));
			buttonValidar.setPreferredSize(new Dimension(75, 25));

			JPanel p = new JPanel();
			p.add(buttonValidar, BorderLayout.NORTH);
			p.add(buttonGravar, BorderLayout.SOUTH);

			JPanel eastPanel = new JPanel();
			eastPanel.add(p, BorderLayout.CENTER);

			JPanel menu = new JPanel(new BorderLayout());
			menu.add(linkAndButton, BorderLayout.NORTH);
			menu.add(panelForTextArea, BorderLayout.CENTER);

			janela.setSize(600, 500);
			janela.setResizable(false);
			janela.setLocation(500, 300);
			janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			janela.add(menu);
			janela.add(eastPanel, BorderLayout.SOUTH);
			janela.setVisible(true);
		}

		public JButton getRulesButton() {
			return pathToRulesButton;
		}

		public JButton getHamButton() {
			return pathToHamButton;
		}

		public JButton getSpamButton() {
			return pathToSpamButton;
		}

		public JTextArea getareaForfiles() {
			return areaForLink;
		}

		public JTextArea getAreaForWeight() {
			return areaForWeight;
		}

		public JButton getGravarButton() {
			return buttonGravar;
		}

		public JButton getValidarButton() {
			return buttonValidar;
		}

		public String getspamTextField() {
			return spamTextField.getText();
		}

		public String getHamTextField() {
			return hamTextField.getText();
		}

		public String getrulesTextField() {
			return rulesTextField.getText();
		}

		public void setSpamTextField(String spamTextField) {
			this.spamTextField.setText(spamTextField);
		}

		public void setHamTextField(String hamTextField) {
			this.hamTextField.setText(hamTextField);
		}

		public void setRulesTextField(String rulesTextField) {
			this.rulesTextField.setText(rulesTextField);
		}

}	
