package AntiSpamFilter_Manual;

import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {
	
	public static void main(String[] args) {
		        
		String spamPath = "files\\spam.log" ;
		String hamPath = "files\\ham.log";
		String rulesPath = "files\\rules.cf";
		LogicClass l = new LogicClass(spamPath, hamPath, rulesPath);
		GraficInterface i = l.getInter();
		JButton b1 = i.getRulesButton();
		JButton b2 = i.getHamButton();
		JButton b3 = i.getSpamButton();
		JButton validar = i.getValidarButton();
		JButton gravar = i.getGravarButton();
		JTextArea a = i.getareaForfiles();
		JTextArea b = i.getAreaForWeight();
		l.actionForButton(b1, a, b);
		l.actionForButton(b2, a, b);
		l.actionForButton(b3, a, b);
		l.actionForButton(gravar, a, b);
		l.actionForButton(validar, a, b);

	}

}
