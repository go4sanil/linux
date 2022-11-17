package inheritance;

public class MysteryCruise extends CruiseMain {
	private String cruiseName = "Mystery_Cruise";
	private String cruiseService = "Casino_Service";
	private int casinoEntryFee = 20;
	private double cruisePriceForAdults = 45.99;
	private double cruisePriceForchildren = 12.99;
	private int cruiseDaysOfStay = 2;
	private int numOfAdults;
	private int numOfChildren;
	private double totalServiceFee;

	protected String cruiseSevice() {
		cruiseYesOrNoInput = needCruiseService(cruiseName, cruiseService, casinoEntryFee, cruiseDaysOfStay,
				cruisePriceForAdults, cruisePriceForchildren);
		if (cruiseYesOrNoInput.equalsIgnoreCase("Y")) {
			priceCalculation();
		}
		return cruiseYesOrNoInput;
	}

	private void priceCalculation() {
		numOfAdults = numofAdults(cruiseName);
		numOfChildren = numofChildren(cruiseName);
		totalServiceFee = cruiseServicesFee(cruiseYesOrNoInput, casinoEntryFee);
		preBookDinnerBuffet();
		finalPriceCalculation(cruiseName, cruiseService, noOfAdults, noOfChildren, cruiseDaysOfStay, cruisePriceForAdults,
				cruisePriceForchildren, totalServiceFee);
	}
}