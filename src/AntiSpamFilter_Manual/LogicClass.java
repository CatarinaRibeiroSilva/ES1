package AntiSpamFilter_Manual;


import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class LogicClass {


	public  File getFile() throws IOException{	
		
		//colocar um if para n�o dar um erro no caso dos files n�o ser selecionado
		
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(new JFrame());
		return chooser.getSelectedFile();
	}
}


