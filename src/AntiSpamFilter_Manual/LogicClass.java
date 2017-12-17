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
	public ReadRules readRules;


	public  File getFile() throws IOException{	
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(new JFrame());
		return chooser.getSelectedFile();
	}
}


