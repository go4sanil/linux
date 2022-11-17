package inheritance;

public class ScenicCruise extends CruiseMain {
	private String cruiseName = "Scenic_Cruise";
	private String cruiseService = "Spa_Service";
	private int spaCharge = 50;
	private double cruisePriceForAdults = 43.99;
	private double cruisePriceForchildren = 12.99;
	private int cruiseDaysOfStay = 3;
	private double totalServiceFee;
	private String cruiseYesOrNoInput = "";
	private int numOfAdults;
	private int numOfChildren;

	protected String cruiseSevice() {
		cruiseYesOrNoInput = needCruiseService(cruiseName, cruiseService, spaCharge, cruiseDaysOfStay, cruisePriceForAdults,
				cruisePriceForchildren);
		if (cruiseYesOrNoInput.equalsIgnoreCase("Y")) {
			priceCalculation();
		}
		return cruiseYesOrNoInput;
	}

	private void priceCalculation() {
		numOfAdults = numofAdults(cruiseName);
		numOfChildren = numofChildren(cruiseName);
		totalServiceFee = cruiseServicesFee(cruiseYesOrNoInput, spaCharge);
		preBookDinnerBuffet();
		finalPriceCalculation(cruiseName, cruiseService, noOfAdults, noOfChildren, cruiseDaysOfStay, cruisePriceForAdults,cruisePriceForchildren, totalServiceFee);
	}
}
