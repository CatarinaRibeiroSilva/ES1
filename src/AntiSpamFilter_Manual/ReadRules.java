package AntiSpamFilter_Manual;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ReadRules {
	private Random random = new Random();
	private String rulesPath = " ";

	private HashMap<String, Integer> rulesMap;

	private FileReader fileReader;

	public ReadRules(String rulesPath) {
		setRulesPath(rulesPath);

	}

	public HashMap<String, Integer> Read(String path) {
		ArrayList<String> listaRules = new ArrayList<>();
		rulesMap = new HashMap<String, Integer>();

		String line = null;

		try {

			try {
				fileReader = new FileReader(path);
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				String[] tokens = line.split("	");
				listaRules.add(tokens[0]);
				int weigth = random.nextInt(5 + 1 + 5) - 5;
				rulesMap.put(tokens[0], weigth);
			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '");

		}
		return rulesMap;
	}

	public String getRulesPath() {
		return rulesPath;
	}

	public void setRulesPath(String rulesPath) {
		this.rulesPath = rulesPath;
	}

}
