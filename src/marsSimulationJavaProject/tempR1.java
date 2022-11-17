package marsSimulationJavaProject;

import java.io.IOException;
import java.util.ArrayList;

public class tempR1 extends Rocket {
	
	String name;
	int weight;
		
	int rocketCost = 100;
	int rocketWeight = 10000;
	int maxRocketWeight = 18000;
	double explosionChance=0;
	int cargoCarried=0;
	int initialWeight=0;
	

	tempR1(String name,int weight)
	{
		this.name=name;
		this.weight=weight;
	}


	@Override
	public boolean launch() {
		
		try {
			explosionChance = (.05)*(cargoCarried()/maxRocketWeight);
			System.out.println("Explosion chance:" +explosionChance);
		} catch (IOException e) {
					e.printStackTrace();
		}

		return true;
	}

	@Override
	public boolean land() {

		try {
			explosionChance = (.1)*(cargoCarried()/maxRocketWeight);
			System.out.println("Explosion chance:" +explosionChance);
		} catch (IOException e) {
					e.printStackTrace();
		}

		return true;
		
		}
	
	public int cargoCarried() throws IOException {
		
		Simulation simulation = new Simulation();
		
		ArrayList<tempR1> items1 =simulation.loadU1();
		
		for (int i = 0; i < items1.size(); i++) {
			//weightCounter = items1.get(i).weight;
			cargoCarried = initialWeight+ (items1.get(i).weight);
			}
		
		return cargoCarried;
		
			}
	
	
}

