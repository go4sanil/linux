package inheritance;

import java.util.Scanner;

public class CruiseAndHotelBooking {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String bookCruiseOrHotel;
		String continueBooking;
		UserClass usc = new UserClass();
		usc.userRegistration();
		String userCruiseSelection = "";
		String input = "";
		int numOfAdults;
		int numOfChildren;
		HotelMain htm = new HotelMain();
		boolean tempVariable = false;
		HotelDeluxSuite hoteldeluxsuite = new HotelDeluxSuite();
		HotelFamilySuite hotelfamilysuite = new HotelFamilySuite();
		CruiseMain cruisemain = new CruiseMain();
		DiscoveryCruise discoverycruise = new DiscoveryCruise();
		SunsetCruise sunsetcruise = new SunsetCruise();
		ScenicCruise sceniccruise = new ScenicCruise();
		MysteryCruise mysterycruise = new MysteryCruise();
		do {
			do {

				System.out.println("Please enter the service you want to book Hotel_Stay/Cruise");
				bookCruiseOrHotel = scn.next();
				if (!bookCruiseOrHotel.equalsIgnoreCase("Hotel_Stay")
						&& !bookCruiseOrHotel.equalsIgnoreCase("Cruise")) {
					System.out.println("Invalid entry, please try again!");
				}
			} while (!bookCruiseOrHotel.equalsIgnoreCase("Hotel_Stay")
					&& !bookCruiseOrHotel.equalsIgnoreCase("Cruise"));

			if (bookCruiseOrHotel.equalsIgnoreCase("Hotel_Stay")) {

				String suiteSelection = htm.hotelroomSelection();

				if (suiteSelection.equalsIgnoreCase("Delux_Suite")) {

					numOfAdults = hoteldeluxsuite.numofAdults(suiteSelection);
					numOfChildren = hoteldeluxsuite.numofChildren(suiteSelection);
					tempVariable = hoteldeluxsuite.setUserNumber(numOfAdults, numOfChildren);
					hoteldeluxsuite.finalPrice();
				} else {

					numOfAdults = hotelfamilysuite.numofAdults(suiteSelection);
					numOfChildren = hotelfamilysuite.numofChildren(suiteSelection);
					tempVariable = hotelfamilysuite.setUserNumber(numOfAdults, numOfChildren);
					hotelfamilysuite.finalPrice();
				}
			} else {
				do {
					userCruiseSelection = cruisemain.cruiseClass();

					switch (userCruiseSelection) {
					case "Scenic_Cruise":
						input = sceniccruise.spaSevice();
						if (input.equalsIgnoreCase("Y")) {

							numOfAdults = sceniccruise.numofAdults(userCruiseSelection);
							numOfChildren = sceniccruise.numofChildren(userCruiseSelection);
							tempVariable = sceniccruise.setUserNumber(numOfAdults, numOfChildren);
							sceniccruise.finalPrice();
						}
						break;
					case "Sunset_Cruise":
						input = sunsetcruise.candleLightDinner();
						if (input.equalsIgnoreCase("Y")) {

							numOfAdults = sunsetcruise.numofAdults(userCruiseSelection);
							numOfChildren = sunsetcruise.numofChildren(userCruiseSelection);
							tempVariable = sunsetcruise.setUserNumber(numOfAdults, numOfChildren);
							sunsetcruise.finalPrice();
						}
						break;
					case "Discovery_Cruise":
						input = discoverycruise.adventureGameFee();
						if (input.equalsIgnoreCase("Y")) {

							numOfAdults = discoverycruise.numofAdults(userCruiseSelection);
							numOfChildren = discoverycruise.numofChildren(userCruiseSelection);
							tempVariable = discoverycruise.setUserNumber(numOfAdults, numOfChildren);
							discoverycruise.finalPrice();
						}
						break;
					case "Mystery_Cruise":
						input = mysterycruise.casinoEntry();
						if (input.equalsIgnoreCase("Y")) {

							numOfAdults = mysterycruise.numofAdults(userCruiseSelection);
							numOfChildren = mysterycruise.numofChildren(userCruiseSelection);
							tempVariable = mysterycruise.setUserNumber(numOfAdults, numOfChildren);
							mysterycruise.finalPrice();
						}
						break;

					default:
						System.out.println("Invalid input, please try again");
						break;

					}
				} while (!input.equalsIgnoreCase("Y"));
			}
			System.out.println("Do you want to book another Hotel Room or Cruise ?(yes/no)");
			continueBooking = scn.next();
		} while (continueBooking.equalsIgnoreCase("Yes"));
	}

}
