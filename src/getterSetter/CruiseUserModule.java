package getterSetter;

import java.util.Scanner;

public class CruiseUserModule {
	private String userEmailAddress;
	private String userPassword;
	String userName;
	private String userPhoneNumber;
	int passwordCounter = 0;
	int userInfoCounter = 0;
	int userInputChangeUserSelection;
	String returnParameter = null;

	Scanner scn = new Scanner(System.in);

	void setUserRegistrationInfo(String userEmailAddress, String userPassword, String userName,
			String userPhoneNumber) {
		this.userEmailAddress = userEmailAddress;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;

	}

	public Boolean checkUserPassword(String userPassword) {
		if (this.userPassword.equals(userPassword)) {
			return true;
		}
		return false;
	}

	void setUserPhonenumber(String userInputChangeInfo) {
		this.userPhoneNumber = userInputChangeInfo;
		System.out.println("User phone number updated");
	}

	void setUserEmailAddress(String userInputChangeInfo) {
		this.userEmailAddress = userInputChangeInfo;
		System.out.println("User Email address updated");
	}

	void setUserPassword(String userInputChangeInfo) {
		this.userPassword = userInputChangeInfo;
		System.out.println("User password updated");
	}

	String setUserInfo() {
		System.out
				.println("Please enter the new " + returnParameter + " that you want to be updated in our database: ");
		String userInputChangeInfo = scn.next();
		return userInputChangeInfo;

	}

	void thankyouMessage() {
		System.out.println("Your " + returnParameter + " has been updated in our records \n"
				+ "Thank you for using our services!");

	}

	void passwordNotCorrect() {
		passwordCounter++;
		if (passwordCounter >= 3) {
			System.out.println("You have reached the maximum number of attempts:Program Terminated\n"
					+ "Please talk to customer desk!");
			System.exit(0);
		}

		System.out.println("Your password you have entered is not correct, please try again \n" + "You are left with "
				+ (3 - passwordCounter) + " more attempts");

	}

	public String changeUserInformation() {

		do {
			System.out.println("Please enter the information you want to change.\n" + "    1. Password\n"
					+ "    2. Phone number\n" + "    3. Email");

			userInputChangeUserSelection = scn.nextInt();
			if (userInputChangeUserSelection == 1) {
				returnParameter = "Password";

			} else if (userInputChangeUserSelection == 2) {
				returnParameter = "Phone_number";

			} else if (userInputChangeUserSelection == 3) {
				returnParameter = "Email";

			} else {
				userInfoCounter++;
				if (userInfoCounter >= 3) {
					System.out.println("You have reached the maximum attempts, program terminated\n"
							+ "Please talk to our customer desk");
					System.exit(0);
				}
				System.out.println("Your input is not correct, please try again \n" + "You are left with"
						+ (3 - userInfoCounter) + " more attempts");
				returnParameter = "invalid input";

			}
		}

		while (!(userInputChangeUserSelection == 1) && !(userInputChangeUserSelection == 2)
				&& !(userInputChangeUserSelection == 3) && userInfoCounter < 3);
		return returnParameter;
	}

}
