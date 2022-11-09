import java.util.Scanner;
import java.util.Arrays;

public class BuyCruiseTicketsMain {

	public static void main(String[] args) {

		BuyCruiseTicket scenicCruise = new BuyCruiseTicket("Scenic_Cruise", 43.99, 12.99, 3);
		BuyCruiseTicket sunsetCruise = new BuyCruiseTicket("Sunset_Cruise", 52.99, 15.99, 1);
		BuyCruiseTicket discoveryCruise = new BuyCruiseTicket("Discovery_Cruise", 39.99, 9.99, 4);
		BuyCruiseTicket mysteryCruise = new BuyCruiseTicket("Mystery_Cruise", 45.99, 12.99, 2);

		BuyCruiseTicket[] buyCruiseTicket = { scenicCruise, sunsetCruise, discoveryCruise, mysteryCruise };

		BuyCruiseTicket buycruiseticket = new BuyCruiseTicket();
		CruiseUserModule cruiseusermodule = new CruiseUserModule();

		cruiseusermodule.setUserRegistrationInfo(emailForUserRegistration, passwordForUserRegistration,
				nameForUserRegistration, phoneNumberForUserRegistration);

		Object cruiseYesOrNoInput = "No input";
		double finalcruisePriceForAdults = 0;
		double finalcruisePriceForchildren = 0;
		int buffetMarker = 0;
		int noOfDaysOnCruise = 0;
		int counter = 0;
		do {
			System.out.println(
					"We offer 4 different packages as displayed below. Please enter the cruise that you want to select:\r\n"
							+ "Scenic_Cruise\r\n" + "Sunset_Cruise\r\n" + "Discovery_Cruise\r\n"
							+ "Mystery_Cruise\r\n");
			String cruiseNameUserInput = scn.next();
			if (cruiseNameUserInput.equalsIgnoreCase("Scenic_Cruise")
					|| cruiseNameUserInput.equalsIgnoreCase("Sunset_Cruise")
					|| cruiseNameUserInput.equalsIgnoreCase("Discovery_Cruise")
					|| cruiseNameUserInput.equalsIgnoreCase("Mystery_Cruise")) {
				for (int i = 0; i < buyCruiseTicket.length; i++) {
					if (cruiseNameUserInput.equalsIgnoreCase(buyCruiseTicket[i].cruiseName)) {
						System.out.println("The cruise that you have selected is " + buyCruiseTicket[i].cruiseName
								+ " which is a " + buyCruiseTicket[i].cruiseDaysOfStay + " day cruise\r\n"
								+ "Price for Adults(greater than 12): " + buyCruiseTicket[i].cruisePriceForAdults
								+ " per day\r\n" + "Price for kids above 5: "
								+ buyCruiseTicket[i].cruisePriceForchildren + " per day\r\n"
								+ "Please press 'Y' if you want to continue with the selection or press any other key to select another.");
						cruiseYesOrNoInput = scn.next();

						finalcruisePriceForAdults = buyCruiseTicket[i].cruisePriceForAdults;
						finalcruisePriceForchildren = buyCruiseTicket[i].cruisePriceForchildren;
						noOfDaysOnCruise = buyCruiseTicket[i].cruiseDaysOfStay;

					}
				}
			}
		} while (!cruiseYesOrNoInput.equals("Y"));

		System.out.println("Enter the number of adults: ");
		int userInputNumOfAdults = scn.nextInt();
		double finalAdultPrice = buycruiseticket.adultPriceCalculation(finalcruisePriceForAdults, noOfDaysOnCruise,
				userInputNumOfAdults);
		System.out.println("Enter the number of children: ");
		int userInputNumOfChildren = scn.nextInt();

		int childArrayCounter = buycruiseticket.childArrayCounterInput(userInputNumOfChildren);

		double finalChildrenPrice = buycruiseticket.adultPriceCalculation(finalcruisePriceForchildren, noOfDaysOnCruise,
				childArrayCounter);

		System.out.println(
				"All our cruises have food service on board. Do you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids? Please press 'Y' to order buffet meals or press any other key to proceed with out buffet order");
		String userInputPreBookBuffet = scn.next();

		if (userInputPreBookBuffet.equalsIgnoreCase("Y")) {
			buffetMarker = 1;
		} else {
			buffetMarker = 0;
		}

		double finalBuffetAdultPrice = buycruiseticket.adultBuffetPriceCalculation(noOfDaysOnCruise,
				userInputNumOfAdults, buffetMarker);

		double finalBuffetChildrenPrice = buycruiseticket.childrenBuffetPriceCalculation(noOfDaysOnCruise,
				childArrayCounter, buffetMarker);

		buycruiseticket.adultAndChildPriceCalculation(finalAdultPrice, finalChildrenPrice, finalBuffetAdultPrice,
				finalBuffetChildrenPrice, userInputNumOfAdults, childArrayCounter, buffetMarker);

		

		System.out.println("\n" + "Do you want to change your personal information. Press Y to change.\n"
				+ "Press any other key to exit.");
		String userInputChangeUserInfo = scn.next();

		if (userInputChangeUserInfo.equalsIgnoreCase("Y")) {
			String useInfo = "";
			do {
				System.out.println("Please enter your current password: ");
				String userPassword = scn.next();

				if (cruiseusermodule.checkUserPassword(userPassword)) {
					useInfo = cruiseusermodule.changeUserInformation();
					String userinfoUpdate = cruiseusermodule.setUserInfo();
					switch (useInfo) {
					case "Password":
						cruiseusermodule.setUserPassword(userinfoUpdate);
						break;
					case "Phone_number":
						cruiseusermodule.setUserPhonenumber(userinfoUpdate);
						break;

					case "Email":
						cruiseusermodule.setUserEmailAddress(userinfoUpdate);
						break;

					default: System.out.println("You have enetered invalid input");
						break;
					}
					cruiseusermodule.thankyouMessage();
				} else {

					cruiseusermodule.passwordNotCorrect();

				}
			} while (!(useInfo.equals("Password") || useInfo.equals("Email") || useInfo.equals("Phone_number")));

		}

		else {
			System.out.println("Thank you for using our service");
		}

	}

}