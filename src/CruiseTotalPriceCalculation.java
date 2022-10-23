
public class CruiseTotalPriceCalculation {
	double adultDinnerBuffetMeals = 20.99;
	double kidsDinnerBuffetMeals = 4.99;

	void adultAndChildPriceCalculation(double finalcruisePriceForAdults, double finalcruisePriceForchildren,
			int noOfDaysInCruise, int userInputNumOfAdults, int userInputNumOfChildren, int childArrayCounter,
			int buffetmarker) {
		double totalPrice = (finalcruisePriceForAdults * userInputNumOfAdults * noOfDaysInCruise)
				+ (childArrayCounter * finalcruisePriceForchildren * noOfDaysInCruise)
				+ (adultDinnerBuffetMeals * userInputNumOfAdults * noOfDaysInCruise * buffetmarker)
				+ (childArrayCounter * kidsDinnerBuffetMeals * noOfDaysInCruise * buffetmarker);
		System.out.println("Your Package includes:");
		System.out.println("Scenic Cruise Adults 		@" + userInputNumOfAdults + "   :"
				+ (finalcruisePriceForAdults * userInputNumOfAdults * noOfDaysInCruise));
		if (childArrayCounter > 0) {
			System.out.println("Scenic Cruise Children above 5 @ " + childArrayCounter + "    :"
					+ (childArrayCounter * finalcruisePriceForchildren * noOfDaysInCruise));
		}
		if (buffetmarker == 1) {
			System.out.println("Buffet Special Price Adults	@" + userInputNumOfAdults + "   :"
					+ (userInputNumOfAdults * adultDinnerBuffetMeals * noOfDaysInCruise * buffetmarker));
		}
		if (childArrayCounter > 0 && buffetmarker == 1) {
			System.out.println("Buffet Special Price Children above 5 @ " + childArrayCounter + "    :"
					+ (childArrayCounter * kidsDinnerBuffetMeals * noOfDaysInCruise * buffetmarker));
		}
		System.out.println("Total Price      :" + totalPrice);
		System.out.println("HST	@ 15%      :" + (0.15 * totalPrice));
		System.out.println("Final Price     :" + ((0.15 * totalPrice) + totalPrice));

	}
}
