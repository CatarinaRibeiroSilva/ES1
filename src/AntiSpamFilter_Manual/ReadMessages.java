package AntiSpamFilter_Manual;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ReadMessages {

	private static List<String> message = null;
	public static List<List<String>> allMessageSPAM;
	public static List<List<String>> allMessageHam;;
	private String rulesPath = " ";
	private int FP;
	private int FN;

	public ReadMessages() {

	}

	public static List<List<String>> lerSpam(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		allMessageSPAM = new ArrayList<List<String>>();
		try {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tokens = line.split("	");
				message = new ArrayList<String>();
				for (int n = 0; n < tokens.length; n++) {
					message.add(tokens[n]);
				}
				allMessageSPAM.add(message);
			}
		} finally {
			scanner.close();

		}
		return allMessageSPAM;
	}
	
	
	public static List<List<String>> lerHam(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		allMessageHam = new ArrayList<List<String>>();
		try {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tokens = line.split("	");
				message = new ArrayList<String>();
				for (int n = 0; n < tokens.length; n++) {
					message.add(tokens[n]);
				}
				allMessageHam.add(message);
			}
		} finally {
			scanner.close();

		}
		return allMessageHam;
	}

}
