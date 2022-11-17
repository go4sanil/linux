package marsSimulationJavaProject;

import java.io.IOException;

public class ProjectMainClass {

	public static void main(String[] args) throws IOException {
	
		Simulation simulation = new Simulation();
		simulation.loadItems();
		simulation.loadU1(); 
		simulation.loadU2(); 
		simulation.runSimulation();
		
		//Rocket rocket = new Rocket();
		//rocket.launch(); 
	}

}
