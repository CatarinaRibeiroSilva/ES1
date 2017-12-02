package AntiSpamFilter_Manual;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JTextArea;



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

	public int calcularFN(JTextArea resultadoSoma) throws FileNotFoundException {
		FN = 0;
		int soma;
		for (int n = 0; n < allMessageSPAM.size(); n++) {
			soma = 0;
			for (int i = 1; i < allMessageSPAM.get(n).size(); i++) {
				// System.out.println(allMessage.get(n).get(i).toString());
				soma = getValueOfMap(readRulesAndValues(), allMessageSPAM.get(n).get(i)) + soma;

			}
			resultadoSoma.append(Integer.toString(soma).toString() + "\n");
			if (soma < 5) {
				FN++;

			}
		}
		System.out.println("Falsos Negativos-Spam : " + FN);
		return FN;
	}

	public int calcularFP(JTextArea resultadoSoma) throws FileNotFoundException {
		FP = 0;

		for (int n = 0; n < allMessageHam.size(); n++) {
			int soma = 0;
			for (int i = 1; i < allMessageHam.get(n).size(); i++) {
				// System.out.println(allMessage.get(n).get(i).toString());
				soma = getValueOfMap(readRulesAndValues(), allMessageHam.get(n).get(i)) + soma;
			}
			resultadoSoma.append(Integer.toString(soma) + "\n");
			if (soma > 5)
				FP++;
		}
		System.out.println("Falsos Positivos-Ham : " + FP);
		return FP;
	}

	public int getFP() {
		return FP;
	}

	public int getFN() {
		return FN;
	}

	public int getValueOfMap(HashMap<String, Integer> rulesMap, String key) {
		for (Map.Entry<String, Integer> map : rulesMap.entrySet()) {
			if (map.getKey().equals(key)) {
				return map.getValue();
			}
		}
		return 0;
	}

	public HashMap<String, Integer> readRulesAndValues() throws FileNotFoundException {
		HashMap<String, Integer> map = new HashMap<>();
		Scanner scanner = new Scanner(new File(rulesPath));
		try {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tokens = line.split("	");
				map.put(tokens[0], Integer.parseInt(tokens[1]));
			}
		} finally {
			scanner.close();
		}
		// for(Map.Entry<String, Integer> r : map.entrySet()) {
		// //System.out.println(r.getKey()+ " " +r.getValue());
		// }
		return map;
	}

	public String getRulesPath() {
		return rulesPath;
	}

	public void setRulesPath(String rulesPath) {
		this.rulesPath = rulesPath;
	}

}


