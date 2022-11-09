package inheritance;

import java.util.Scanner;

public class UserClass {

	String emailForUserRegistration;
	String passwordForUserRegistration;
	String nameForUserRegistration;
	String phoneNumberForUserRegistration;
	int noOfAdults;
	int noOfChildren;
	int noOfAdultsCruise;
	int noOfChildrenCruise;
	boolean adultErrorMessage;
	boolean childErrorMessage;
	Scanner scn = new Scanner(System.in);

	public boolean setUserNumber(int noOfAdults, int noOfChildren) {
		this.noOfAdults = noOfAdults;
		this.noOfChildren = noOfChildren;
		return true;
	}

	public void userRegistration() {

		System.out.println("Welcome to online Booking.\n" + "Please sign up to procced with booking.\n"
				+ "Enter your email address:");
		emailForUserRegistration = scn.next();
		System.out.println("Enter the password that you want to use:");
		passwordForUserRegistration = scn.next();
		System.out.println("Enter your Full Name:");
		nameForUserRegistration = scn.next();
		System.out.println("Enter your phone number:");
		phoneNumberForUserRegistration = scn.next();
		System.out.println("Thank you for registering!");
	}

	public int numofAdults(String suiteSelection) {

		do {
			System.out.println("Enter the number of adults :");
			noOfAdults = scn.nextInt();
			adultErrorMessage = false;
			if (suiteSelection.equalsIgnoreCase("Family_Suite")) {
				if (noOfAdults > 4) {
					adultErrorMessage(suiteSelection);
				}
			} else if (suiteSelection.equalsIgnoreCase("Delux_Suite")) {
				if (noOfAdults > 2) {
					adultErrorMessage(suiteSelection);
				}
			}
		} while (adultErrorMessage);
		return noOfAdults;
	}

	public int numofChildren(String suiteSelection) {

		do {
			System.out.println("Enter the number of children :");
			noOfChildren = scn.nextInt();
			childErrorMessage = false;

			if (suiteSelection.equalsIgnoreCase("Family_Suite")) {
				if (noOfChildren > 4) {
					childErrorMessage(suiteSelection);
				}
			} else if (suiteSelection.equalsIgnoreCase("Delux_Suite")) {
				if (noOfChildren > 2) {
					childErrorMessage(suiteSelection);
				}
			}
		} while (childErrorMessage);
		return noOfChildren;

	}

	public void adultErrorMessage(String suiteSelection) {
		System.out.println(
				"Number of adults is above the prescribed " + suiteSelection + " room limit, please try again ");
		adultErrorMessage = true;
	}

	public void childErrorMessage(String suiteSelection) {
		System.out.println(
				"Number of Children is above the prescribed " + suiteSelection + " room limit, please try again ");
		childErrorMessage = true;
	}

}
