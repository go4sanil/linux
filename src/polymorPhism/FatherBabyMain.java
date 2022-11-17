package polymorPhism;

public class FatherBabyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Baby baby = new Baby();
		baby.shooting();
		
		Father father = new Father();
		father.shooting();
		
		Father father1 = new Baby();
		Father father2 = new GrandBaby();
		
		Baby baby1=  new Father();

	}

}
