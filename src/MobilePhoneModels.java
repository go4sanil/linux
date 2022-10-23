
public class MobilePhoneModels {
	String operatingSystem;
	String brandName;
	double screenSize;
	String welcomeScreen = "Welcome: Switching on";

	public MobilePhoneModels(String os, String bName, double scrnSize) {

		operatingSystem = os;
		brandName = bName;
		screenSize = scrnSize;
	}

	void switchOnMobilePhone() {

		System.out.println(welcomeScreen);
		System.out.println("Mobile switched on: " +   + " with os " + operatingSystem);

	}

	void makeCall() {
		System.out.println(welcomeScreen);
		System.out.println("Making a call on: " + brandName);

	}

	void printOperatingSysstem(String operatingSystem) {

		System.out.println("Operating System: " + operatingSystem);

	}

}
