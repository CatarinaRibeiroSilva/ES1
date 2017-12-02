package AntiSpamFilter_Manual;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class Main {

	public static void main(String[] args) {
		String spamPath = "C:\\Users\\Keven\\Desktop\\4ºAno\\InterfaceGráfica (2)\\InterfaceGráfica\\src\\spam.log";
		String hamPath = "C:\\Users\\Keven\\Desktop\\4ºAno\\InterfaceGráfica (2)\\InterfaceGráfica\\src\\ham.log";
		String rulesPath = "C:\\Users\\Keven\\Desktop\\4ºAno\\InterfaceGráfica (2)\\InterfaceGráfica\\src\\rules.cf";
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
