package getterSetter;

  
public class CricketTeamInformationMain {

	public static void main(String[] args) {

		CricketTeamInformation kohli = new CricketTeamInformation("Virat", null, "101", 32, "kohli@gmail.com");
		CricketTeamInformation rohit = new CricketTeamInformation("Rohit", "Sharma", "102", 33, "rohit@gmail.com");
		CricketTeamInformation rahul = new CricketTeamInformation("K_L", null, "103", 34, "rahul@gmail.com");
		CricketTeamInformation rishab = new CricketTeamInformation("Rishab", "Pant", "104", 35, "rishab@gmail.com");

		kohli.setSecondName("Kohli");

		kohli.getSecondName();

		rahul.setSecondName("Rahul");
		
		rahul.getSecondName();
		
		
		rishab.setAgeofEmployee(34,"User");  // user input "Administrator" or "user";
		
	
		rohit.getEmailid();
	}
}
