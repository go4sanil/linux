package marsSimulationJavaProject;

import java.io.IOException;
import java.util.ArrayList;

public class R1 extends Rocket{
	
	Object  tempr1;
		
	int rocketCost = 100;
	int rocketWeight = 10000;
	int maxRocketWeight = 18000;
	double explosionChance=0;
	int cargoCarried=0;
	int initialWeight=0;
	

	R1(Object  tempr1)
	{
		this.tempr1=tempr1;
	
	}


	@Override
	public boolean launch() {
		
		try {
			explosionChance = ((.05)*((cargoCarried())/maxRocketWeight));
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
		
			
		for (int i = 0; i < tempr1.size(); i++) {
			
			cargoCarried = cargoCarried+ (tempr1.get(i).weight);
			}
		System.out.println("Cargo carried" +cargoCarried);
		return cargoCarried;
		
			}
	
	
}

