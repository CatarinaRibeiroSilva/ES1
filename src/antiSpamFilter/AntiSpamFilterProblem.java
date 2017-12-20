package antiSpamFilter;

import java.util.ArrayList;
import java.util.List;

import org.uma.jmetal.problem.impl.AbstractDoubleProblem;
import org.uma.jmetal.solution.DoubleSolution;

import AntiSpamFilter_Manual.ReadMessages;

public class AntiSpamFilterProblem extends AbstractDoubleProblem {

	public AntiSpamFilterProblem() {
		// 335 variables (anti-spam filter rules) by default
		this(335);
	}

	public AntiSpamFilterProblem(Integer numberOfVariables) {
		setNumberOfVariables(numberOfVariables);
		setNumberOfObjectives(2);
		setName("AntiSpamFilterProblem");

		List<Double> lowerLimit = new ArrayList<>(getNumberOfVariables());
		List<Double> upperLimit = new ArrayList<>(getNumberOfVariables());

		for (int i = 0; i < getNumberOfVariables(); i++) {
			lowerLimit.add(-5.0);
			upperLimit.add(5.0);
		}

		setLowerLimit(lowerLimit);
		setUpperLimit(upperLimit);
	}

	public void evaluate(DoubleSolution solution) {

		double[] x = new double[getNumberOfVariables()];
		for (int i = 0; i < solution.getNumberOfVariables(); i++) {
			x[i] = solution.getVariableValue(i);
		}

		ReadMessages readMessages = new ReadMessages();

		// usar só depois de mudar a estrutura do calculo do FP e FN
		// readMessages.calcularFN();
		// readMessages.calcularFP();
		
		int fp = readMessages.getFP();
		int fn = readMessages.getFN();
		solution.setObjective(0, fp);
		solution.setObjective(1, fn);
	}
}
