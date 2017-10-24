package problem9;
import java.text.DecimalFormat;
public class Species {
	private String name;
	private double population;
	private double growthRate;
	DecimalFormat percent000dot00=new DecimalFormat("000.00%");
	public void setName(String inputName) {
		name=inputName;
	}
	public String getName() {
		return name;
	}
	public void setPopulation(double inputPopulation) {
		population=inputPopulation;
	}
	public double getPopulation() {
		return population;
	}
	public void setGrowthRate(double inputRate) {
		growthRate=inputRate;
	}
	public double getGrowthRate() {
		return growthRate;
	}
	Species(){
		
	}
	Species(String inputName){
		setName(inputName);
		
	}
	Species(String inputName, double inputPopulation){
		setName(inputName);
		setPopulation(inputPopulation);
	}
	Species(String inputName, double inputPopulation, double inputRate){
		setName(inputName);
		setPopulation(inputPopulation);
		setGrowthRate(inputRate);
	}
}
