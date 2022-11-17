package inheritance;

public class DiscoveryCruise extends CruiseMain {
	private String cruiseName = "Discovery_Cruise";
	private String cruiseService = "Adventure_Games";
	private int adventureGameFee = 50;
	private double cruisePriceForAdults = 39.99;
	private double cruisePriceForchildren = 9.99;
	private int cruiseDaysOfStay = 4;
	private int numOfAdults;
	private int numOfChildren;
	private double totalServiceFee;

	protected String cruiseSevice() {
		cruiseYesOrNoInput = needCruiseService(cruiseName, cruiseService, adventureGameFee, cruiseDaysOfStay,
				cruisePriceForAdults, cruisePriceForchildren);
		if (cruiseYesOrNoInput.equalsIgnoreCase("Y")) {
			priceCalculation();
		}
		return cruiseYesOrNoInput;
	}

	private void priceCalculation() {
		numOfAdults = numofAdults(cruiseName);
		numOfChildren = numofChildren(cruiseName);
		totalServiceFee = cruiseServicesFee(cruiseYesOrNoInput, adventureGameFee);
		preBookDinnerBuffet();
		finalPriceCalculation(cruiseName, cruiseService, noOfAdults, noOfChildren, cruiseDaysOfStay, cruisePriceForAdults,
				cruisePriceForchildren, totalServiceFee);
	}
}