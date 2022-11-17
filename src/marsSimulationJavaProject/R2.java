package marsSimulationJavaProject;

public class R2 extends Rocket {
	int rocketCost=120;
	int rocketWeight = 18000;
	int maxWeightwthCargo = 29000;
	
	
	String name;
	int weight;
		
	
	R2(String name,int weight)
	{
		this.name=name;
		this.weight=weight;
	}


	public boolean launch() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return false;
	}
}

/*
 * • Can carry to a total of 29 tonnes. • It costs $120 Million to build •
 * Weighs 18 tonnes. • It has a greater chance of crashing while landing than
 * while launching, but just like the R-1 both chances depend on the amount of
 * cargo carried.
 */

/*
 * Rocket cost = $120 Million Rocket weight = 18 Tonnes Max weight (with cargo)
 * = 29 Tonnes Chance of launch explosion = 4% * (cargo carried / cargo limit)
 * Chance of landing crash = 8% * (cargo carried / cargo limit)
 */
