package getterSetter;

import java.util.Scanner;

public class BuyCruiseTicket {

	String cruiseName;
	double cruisePriceForAdults;
	double cruisePriceForchildren;
	int cruiseDaysOfStay;

	Scanner scn = new Scanner(System.in);

	BuyCruiseTicket(String cruiseNAme, double cruisePriceforAdults, double cruisePriceforChildren,
			int cruiseDaysofStay) {
		cruiseName = cruiseNAme;
		cruisePriceForAdults = cruisePriceforAdults;
		cruisePriceForchildren = cruisePriceforChildren;
		cruiseDaysOfStay = cruiseDaysofStay;

	}

	BuyCruiseTicket() {
	}

	double adultDinnerBuffetMeals = 20.99;
	double kidsDinnerBuffetMeals = 4.99;

	double adultPriceCalculation(double finalcruisePriceForAdults, int noOfDaysInCruise, int userInputNumOfAdults) {
		double finalAdultPrice = finalcruisePriceForAdults * noOfDaysInCruise * userInputNumOfAdults;
		return finalAdultPrice;
	}

	double childPriceCalculation(double finalcruisePriceForChildren, int noOfDaysInCruise, int userInputNumOfChildren) {
		double finalChildrenPrice = finalcruisePriceForChildren * noOfDaysInCruise * userInputNumOfChildren;
		return finalChildrenPrice;
	}

	int childArrayCounterInput(int userInputNumOfChildren) {
		int childArrayCounter = 0;
		int[] childArray = new int[userInputNumOfChildren];

		if (userInputNumOfChildren > 0) {
			for (int j = 0; (j < (userInputNumOfChildren)); j++) {
				System.out.println("Enter the age of child " + (j + 1));
				childArray[j] = scn.nextInt();
				if (childArray[j] > 5) {
					childArrayCounter++;
				}

			}
		}
		return childArrayCounter;
	}

	double adultBuffetPriceCalculation(int noOfDaysInCruise, int userInputNumOfAdults, int buffetMarker) {
		double finalBuffetAdultPrice = adultDinnerBuffetMeals * noOfDaysInCruise * userInputNumOfAdults * buffetMarker;
		return finalBuffetAdultPrice;
	}

	double childrenBuffetPriceCalculation(int noOfDaysOnCruise, int userInputNumOfAdults, int buffetMarker) {
		double finalBuffetAdultPrice = kidsDinnerBuffetMeals * noOfDaysOnCruise * userInputNumOfAdults * buffetMarker;
		return finalBuffetAdultPrice;
	}

	void adultAndChildPriceCalculation(double finalAdultPrice, double finalChildrenPrice, double finalBuffetAdultPrice,
			double finalBuffetChildrenPrice, int userInputNumOfAdults, int childArrayCounter, int buffetMarker) {

		double totalPrice = finalAdultPrice + finalChildrenPrice + finalBuffetAdultPrice + finalBuffetChildrenPrice;
		System.out.println("Your Package includes:");
		System.out.println("Scenic Cruise Adults @ " + userInputNumOfAdults + "   :" + (finalAdultPrice));
		if (childArrayCounter > 0) {
			System.out.println("Scenic Cruise Children above 5 @ " + childArrayCounter + "    :" + finalChildrenPrice);
		}
		if (buffetMarker == 1) {
			System.out
					.println("Buffet Special Price Adults @ " + userInputNumOfAdults + "   :" + finalBuffetAdultPrice);
		}
		if (childArrayCounter > 0 && buffetMarker == 1) {
			System.out.println("Buffet Special Price Children above 5 @ " + childArrayCounter + "    :"
					+ finalBuffetChildrenPrice);
		}
		System.out.println("Total Price      :" + totalPrice);
		System.out.println("HST @ 15%      :" + (0.15 * totalPrice));
		System.out.println("Final Price     :" + ((0.15 * totalPrice) + totalPrice));

	}
}