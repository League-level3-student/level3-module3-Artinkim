package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		farm.add(new Pig());
		farm.add(new Cow());
		farm.add(new Duck());
		farm.add(new Sheep());
		farm.add(new Cow());
		farm.add(new Duck());
		for(Animal a: farm) {
			a.eat();
			a.makeNoise();
		}
	}
}
