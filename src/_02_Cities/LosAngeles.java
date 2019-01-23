package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		return (getPopulation()*getGrowthRate()*1/2*getGrowthRate());
	}
	
}
