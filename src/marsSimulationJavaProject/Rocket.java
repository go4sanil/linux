package marsSimulationJavaProject;

public class Rocket implements SpaceShip{
	Object item;
	
	public boolean launch() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean land() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canCarry(Object item) {

		System.out.println(item.getClass());
		
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean carry(Object Item) {
		// TODO Auto-generated method stub
		return false;
	}



}
