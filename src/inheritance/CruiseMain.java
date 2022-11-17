package inheritance;

public class CruiseMain extends UserClass {
	protected String cruiseNameUserInput;
	protected String cruiseYesOrNoInput;
	private String yesNoDinnerBuffet;
	private Boolean needDinnerBuffet = false;
	private double adultAdditionalPriceMeal = 20.99;
	private double childAdditionalPriceMeal = 4.99;
	private double totalPriceServicesFee;

	public void hotelSuite()
	{}
	protected void preBookDinnerBuffet() {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.(yes/no)");
		yesNoDinnerBuffet = scn.next();
		if (yesNoDinnerBuffet.equalsIgnoreCase("Yes")) {
			needDinnerBuffet = true;
		}
	}

	private double priceCalcDinnerBuffet(int cruiseDaysOfStay) {

		if (needDinnerBuffet) {
			if (noOfAdults > 0) {
				System.out.println("Lunch Pre-Booked Special Rate Adults @" + noOfAdults + " :  "
						+ (adultAdditionalPriceMeal * noOfAdults*cruiseDaysOfStay) + "$");
			}
			if (noOfChildren > 0) {
				System.out.println("Lunch Pre-Booked Special Rate Children @" + noOfChildren + " :  "
						+ (childAdditionalPriceMeal * noOfChildren*cruiseDaysOfStay) + "$");
			}
			return ((adultAdditionalPriceMeal * noOfAdults) + (childAdditionalPriceMeal * noOfChildren));
		} else {
			return 0;
		}
	}

	protected double cruiseServicesFee(String cruiseYesOrNoInput, double servicesFee) {
		if (cruiseYesOrNoInput.equalsIgnoreCase("Y")) {
			totalPriceServicesFee = servicesFee * noOfAdults;
		}
		return totalPriceServicesFee;
	}

	protected String needCruiseService(String cruiseName, String cruiseService, double serviceFee, int cruiseDaysOfStay,
			double cruisePriceForAdults, double cruisePriceForchildren) {
		System.out.println(cruiseName + " is offering for adults " + cruiseService + " " + serviceFee
				+ "$ per person. Would you like to go for this option ? (yes/no)");
		String isOptingCruiseService = scn.next();
		cruiseYesOrNoInput = isOptingCruiseService(isOptingCruiseService, cruiseName, cruiseService, serviceFee,
				cruiseDaysOfStay, cruisePriceForAdults, cruisePriceForchildren);
		return cruiseYesOrNoInput;

	}

	private String isOptingCruiseService(String isOptingCruiseService, String cruiseName, String cruiseService,
			double serviceFee, int cruiseDaysOfStay, double cruisePriceForAdults, double cruisePriceForchildren) {
		System.out.print("The cruise that you have selected is " + cruiseName + " which is a " + cruiseDaysOfStay
				+ " day cruise");
		if (isOptingCruiseService.equalsIgnoreCase("Yes")) {
			System.out.println(" with " + cruiseService + " (" + serviceFee + "$) fee per person");
		}
		System.out.println("Price for Adults(greater than 12): " + cruisePriceForAdults + " per day\r\n"
				+ "Price for kids above 5: " + cruisePriceForchildren + " per day\r\n"
				+ "Please press 'Y' if you want to continue with the selection or press any other key to select another.");
		cruiseYesOrNoInput = scn.next();
		return cruiseYesOrNoInput;

	}

	protected boolean finalPriceCalculation(String cruiseName, String cruiseService, int noOfAdults, int noOfChildren,
			int cruiseDaysOfStay, double cruisePriceForAdults, double cruisePriceForchildren, double totalServiceFee) {
		System.out.println("Your Package includes:");
		System.out.println(cruiseName + " " + "Adults	@" + noOfAdults + ":  "
				+ (cruiseDaysOfStay * cruisePriceForAdults * noOfAdults) + "$");
		System.out.println(cruiseName + " " + "Children	@" + noOfChildren + ":  "
				+ (cruiseDaysOfStay * cruisePriceForchildren * noOfChildren) + "$");
		double totalBuffetPrice = priceCalcDinnerBuffet(cruiseDaysOfStay);
		if (totalServiceFee > 0) {
			System.out.println(
					cruiseName + " " + cruiseService + " for Adults@" + (noOfAdults) + " :  " + totalServiceFee + "$");
		}
		double totalPrice = totalServiceFee + (totalBuffetPrice*cruiseDaysOfStay)
				+ (cruiseDaysOfStay * ((cruisePriceForAdults * noOfAdults)) + (cruisePriceForchildren * noOfChildren));
		System.out.println("Total Price      :  " + (formatter.format(totalPrice)) + "$");
		System.out.println("HST	@ 18%    :  " + (formatter.format(totalPrice * .18)) + "$");
		System.out.println("Final Price	 :  " + (formatter.format(totalPrice * 1.18)) + "$");
		return true;
	}

}
