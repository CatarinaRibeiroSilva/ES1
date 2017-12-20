package AntiSpamFilter_Manual;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class LogicClass {


	public File getFile() throws IOException {

		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(new JFrame());
		return chooser.getSelectedFile();

	}
	
	public void run(){
		GraficInterface i = new GraficInterface();
	}
	
}
