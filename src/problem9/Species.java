package problem9;

import java.text.DecimalFormat;

public class Species {
	private String name;
	private double population;
	private double growthRate;

	public boolean endangered() {
		if (growthRate <= 0)
			return true;
		else
			return false;
	}

	DecimalFormat percent00dot00 = new DecimalFormat("00.00%");

	public void setName(String inputName) {
		name = inputName;
	}

	public String getName() {
		return name;
	}

	public void setPopulation(double inputPopulation) {
		population = inputPopulation;
	}

	public double getPopulation() {
		return population;
	}

	public void setGrowthRate(double inputRate) {
		growthRate = inputRate;
	}

	public double debugGrowth() {
		return growthRate;
	}

	public String getGrowthRate() {
		return percent00dot00.format(growthRate);
	}

	public void speciesInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Population: " + getPopulation());
		System.out.println("Rate of growth: " + getGrowthRate());
		if (endangered())
			System.out.println(getName() + " is ENDANGERED");
	}

	Species() {

	}

	Species(String inputName) {
		setName(inputName);

	}

	Species(String inputName, double inputPopulation) {
		setName(inputName);
		setPopulation(inputPopulation);
	}

	Species(String inputName, double inputPopulation, double inputRate) {
		setName(inputName);
		setPopulation(inputPopulation);
		setGrowthRate(inputRate);
	}
}
