package AntiSpamFilter_Manual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class LogicClass {

	private HashMap<String, Integer> rulesMap;
	private List<List<String>> SH_message;
	private String CheckButoes;
	private ReadMessages messagesReader = null;
	private ReadRules rules = null;


	public LogicClass() {
		
		
	/* actionForButton(JButton button, JTextArea area, JTextArea weightArea) {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (button.getText().equals("Open Rules file")) {
					weightArea.setEditable(true);
					area.selectAll();
					area.replaceSelection("");
					weightArea.selectAll();
					weightArea.replaceSelection("");
					CheckButoes = "Rules";
					rulesToInterface(area, weightArea);
				}

				if (button.getText().equals("Gravar")) {
					if (CheckButoes.equals("Rules")) {
						System.out.println("Valores guardados");

						rules.saveRules(area, weightArea);
					}
				}

				if (button.getText().equals("Open Ham file")) {
					area.selectAll();
					area.replaceSelection("");
					weightArea.selectAll();
					weightArea.replaceSelection("");
					CheckButoes = "Ham";
					try {
						hamToInterface(area);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
				}

				if (button.getText().equals("Open Spam file")) {
					area.selectAll();
					area.replaceSelection("");
					weightArea.selectAll();
					weightArea.replaceSelection("");
					CheckButoes = "Spam";
					try {
						spamToInterface(area);

					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
				}

				if (button.getText().equals("Validar")) {
					if (CheckButoes.equals("Spam")) {
						try {
							weightArea.setEditable(false);
							messagesReader.calcularFN(weightArea);

							JOptionPane.showMessageDialog(frameDeResultado(),
									"Numeros de Falsos Negativos : " + messagesReader.getFN());

						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}
					} else if (CheckButoes.equals("Ham")) {
						try {
							weightArea.setEditable(false);
							messagesReader.calcularFP(weightArea);

							JOptionPane.showMessageDialog(frameDeResultado(),
									"Numeros de Falsos Positivos : " + messagesReader.getFP());
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}
					}

				}

				area.updateUI();
				area.repaint();
			}

		});

	}

	public JFrame frameDeResultado() {
		JFrame frame = new JFrame("Message");
		frame.setSize(600, 500);
		frame.setResizable(false);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		return frame;
	}

	private void rulesToInterface(JTextArea area, JTextArea weightArea) {
	//	rulesMap = rules.Read(inter.getrulesTextField());
		for (Map.Entry<String, Integer> map : rulesMap.entrySet()) {
			String chave = map.getKey();
			int peso = map.getValue();
			area.append(chave + "\n");
			weightArea.append(peso + "\n");
		}
	}

	public void hamToInterface(JTextArea area) throws FileNotFoundException {
		//setSH_message(ReadMessages.lerHam(inter.getHamTextField()));

	}

	public void spamToInterface(JTextArea area) throws FileNotFoundException {

		//setSH_message(ReadMessages.lerSpam(inter.getspamTextField()));
	}

	public GraficInterface getInter() {
		return inter;
	}

	public void setInter(GraficInterface inter) {
		this.inter = inter;
	}

	public ReadRules getRules() {
		return rules;
	}

	public void setRules(ReadRules rules) {
		this.rules = rules;

	}

	public String getRulesPath() {
		return rulesPath;
	}

	public void setRulesPath(String rulesPath) {
		this.rulesPath = rulesPath;
	}

	public List<List<String>> getSH_message() {
		return SH_message;
	}

	public void setSH_message(List<List<String>> sH_message) {
		SH_message = sH_message;
	}*/
	}
	
	public  File getFile() throws IOException{	
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(new JFrame());
		return chooser.getSelectedFile();
	}
}


