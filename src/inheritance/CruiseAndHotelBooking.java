package inheritance;
import java.util.Scanner;
public class CruiseAndHotelBooking {
	public static void main(String[] args) {
		
		String bookCruiseOrHotel;
		String continueBooking;
		String userCruiseSelection = "";
		String userInputYesOrNo = "";
		UserClass userclass = new UserClass();
		Scanner scn = new Scanner(System.in);
		String suiteSelection = "";
	
		
		/*System.out.println("Welcome to online Booking.\n" + "Please sign up to procced with booking.\n"
				+ "Enter your email address:");
		String emailForUserRegistration = scn.next();
		System.out.println("Enter the password that you want to use:");
		String passwordForUserRegistration = scn.next();
		System.out.println("Enter your Full Name:");
		String nameForUserRegistration = scn.next();
		System.out.println("Enter your phone number:");
		String phoneForUserRegistration = scn.next();
		userclass.setUserRegistration(emailForUserRegistration,passwordForUserRegistration,nameForUserRegistration,phoneForUserRegistration);
		*/
		do {
			do {

				System.out.println("Please enter the service you want to book Hotel/Cruise");
				bookCruiseOrHotel = scn.next();
				if (!bookCruiseOrHotel.equalsIgnoreCase("Hotel")
						&& !bookCruiseOrHotel.equalsIgnoreCase("Cruise")) {
					System.out.println("Invalid entry, please try again!");
					userclass.counter();
				}
			} while (!bookCruiseOrHotel.equalsIgnoreCase("Hotel")
					&& !bookCruiseOrHotel.equalsIgnoreCase("Cruise"));

			if (bookCruiseOrHotel.equalsIgnoreCase("Hotel")) {
				System.out.println("Please enter the room you want to select" + "\n"
						+ "Delux: accommodates 2 adults and 2 children at the rate of $180/ night" + "\n"
						+ "Family: accommodates 4 adults and 4 children at $230/ night.");
				suiteSelection = scn.next();
				
				switch (suiteSelection) {
				case "delux":
					userclass = new HotelDeluxSuite();
					break;
				case "Family":
					userclass = new HotelDeluxSuite();
					break;
				default:
					System.out.println("Invalid input, please try again");
					userclass.counter();
					break;
					
					
				} 
				userclass.hotelSuite();
				
			} else {
				do {
					System.out.println(
							"We offer 4 different packages as displayed below. Please enter the cruise that you want to select:\r\n"
									+ "Scenic_Cruise\r\n" + "Sunset_Cruise\r\n" + "Discovery_Cruise\r\n" + "Mystery_Cruise\r\n");
					String cruiseNameUserInput = scn.next();
					
					switch (cruiseNameUserInput) {
					case "Scenic_Cruise":
						userclass = new ScenicCruise();
						break;
					case "Sunset_Cruise":
						userclass = new SunsetCruise();
						break;
					case "Discovery_Cruise":
						userclass = new DiscoveryCruise();
						break;
					case "Mystery_Cruise":
						userclass = new MysteryCruise();
						break;
					default:
						System.out.println("Invalid input, please try again");
						userclass.counter();
						break;
					}userclass.cruiseSevice();
				} while (!userInputYesOrNo.equals("delux")&& !userInputYesOrNo.equals("family")&& !userInputYesOrNo.equals("Scenic_Cruise")&& !userInputYesOrNo.equals("Sunset_Cruise")&& !userInputYesOrNo.equals("Discovery_Cruise")&& !userInputYesOrNo.equals("MysteryCruise"));
			}
			System.out.println("Do you want to book another Hotel Room or Cruise ?(yes/no)");
			continueBooking = scn.next();
		} while (continueBooking.equalsIgnoreCase("Yes"));
	}

}
