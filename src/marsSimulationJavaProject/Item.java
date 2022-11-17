package marsSimulationJavaProject;

public class Item {
	
	String name;
	int weight;
	
	Item(String name,int weight)
	{
		this.name=name;
		this.weight=weight;
	}


    public String getName() {
        return name;
    }

    public int weight() {
        return weight;
    }
	
    @Override
    public String toString() {
        return "Name: " + this.name + 
               ", Weight " + this.weight;
    }
	
}
