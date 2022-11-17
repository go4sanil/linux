package inheritance;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class UserClass {

	private String emailForUserRegistration,passwordForUserRegistration,nameForUserRegistration,phoneNumberForUserRegistration;
	protected int noOfAdults,noOfChildren,noOfAdultsCruise,noOfChildrenCruise,counter;
	private boolean errorMessage;
	Scanner scn = new Scanner(System.in);
	NumberFormat formatter = new DecimalFormat("#0.00");

	protected void setUserRegistration(String emailForUserRegistration,String passwordForUserRegistration,String nameForUserRegistration,String phoneForUserRegistration) {
		
		setUserEmailAddress(emailForUserRegistration);
		setUserPassword(passwordForUserRegistration);
		setUserName(nameForUserRegistration);
		setUserPhoneNumber(phoneForUserRegistration);
		thankYouMessage();
	}
	
	private void setUserName(String nameForUserRegistration) {
		this.nameForUserRegistration = nameForUserRegistration;
	}
	private void setUserPhoneNumber(String phoneNumberForUserRegistration) {
		this.phoneNumberForUserRegistration = phoneNumberForUserRegistration;
	}
	private void setUserEmailAddress(String emailForUserRegistration) {
		this.emailForUserRegistration = emailForUserRegistration;
	}
	private void setUserPassword(String passwordForUserRegistration) {
		this.passwordForUserRegistration = passwordForUserRegistration;
	}
	private void thankYouMessage() {
	System.out.println("Thank you for registering!");
	}
	public void hotelSuite()
	{}
	
	protected String cruiseSevice()
	{return null;}
	protected int numofAdults(String suiteSelection) {

		do {
			errorMessage = false;
			System.out.println("Enter the number of adults :");
			noOfAdults = scn.nextInt();
			occupancyCheck(suiteSelection);
		} while (errorMessage);
		return noOfAdults;
	}

	protected int numofChildren(String suiteSelection) {
		do {
			errorMessage = false;
			System.out.println("Enter the number of children :");
			noOfChildren = scn.nextInt();
			occupancyCheck(suiteSelection);
		} while (errorMessage);
		return noOfChildren;

	}

	private void occupancyCheck(String suiteSelection) {
		if (suiteSelection.equalsIgnoreCase("Family_Suite")) {
			if (noOfChildren > 4 || noOfAdults > 4) {
				errorMessage(suiteSelection);
			}
		} else if (suiteSelection.equalsIgnoreCase("Delux_Suite")) {
			if (noOfChildren > 2 || noOfAdults > 2) {
				errorMessage(suiteSelection);
			}
		}
	}

	private void errorMessage(String suiteSelection) {
		System.out.println("Number is above the prescribed " + suiteSelection + " room limit, please try again ");
		errorMessage = true;
	}
	
	protected void counter()
	{counter++;
	if (counter>3)
	{System.out.println("Maximum attempts exeeded, program terminating!");
	System.exit(0);}
	}

}
