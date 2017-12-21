package AntiSpamFilter_Manual;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class LogicClass {


	public File getFile() throws IOException {
		/** this method allow the user, using the JFileChooser , selected the file that user wants*/
		JFileChooser chooser = new JFileChooser();
		int returnVal = chooser.showOpenDialog(new JFrame());
		return chooser.getSelectedFile();

	}
	
	/** Invoc the interface */
	public void run(){
		GraficInterface i = new GraficInterface();
	}
	
}
