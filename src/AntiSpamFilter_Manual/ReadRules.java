package AntiSpamFilter_Manual;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.swing.JTextArea;

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

	public void saveRules(JTextArea area, JTextArea weight) {
		// ArrayList<String> values = new ArrayList<>();
		java.util.List<String> rules;
		java.util.List<String> values;
		HashMap<String, Integer> rulesMap = new HashMap<String, Integer>();
		rules = Arrays.asList(area.getText().split("\n"));
		values = Arrays.asList(weight.getText().split("\n"));

		for (int i = 0; i < rules.size(); i++) {
			int value = Integer.parseInt(values.get(i));
			String rule = rules.get(i);
			rulesMap.put(rule, value);
		}

		try (BufferedWriter writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream(rulesPath), "utf-8"))) {
			for (Map.Entry<String, Integer> map : rulesMap.entrySet()) {
				String chave = map.getKey();
				int valor = map.getValue();
				writer.write(chave + "	" + valor);
				writer.newLine();
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public String getRulesPath() {
		return rulesPath;
	}

	public void setRulesPath(String rulesPath) {
		this.rulesPath = rulesPath;
	}

}
