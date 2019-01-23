package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		return ((getPopulation()*getGrowthRate())+.5*getPopulation());
	}

}
