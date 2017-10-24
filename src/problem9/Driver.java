package problem9;

public class Driver {

	public static void main(String[] args) {
		Species rhino = new Species("Northern White Rhinoceros", 3, 0);
		rhino.speciesInfo();
		rhino.setName("Southern White Rhinoseros");
		rhino.setPopulation(20000);
		rhino.setGrowthRate((5.0 / 8.0));
		rhino.speciesInfo();
		System.out.println(rhino.debugGrowth());
		System.out.println(rhino.endangered());
	}

}
