package inheritance;

public class SunsetCruise extends CruiseMain {
	private String cruiseName = "Sunset_Cruise";
	private String cruiseService = "Candle_Light_Dinner";
	private int candleLightDinnerFee = 45;
	private double cruisePriceForAdults = 52.99;
	private double cruisePriceForchildren = 15.99;
	private int cruiseDaysOfStay = 1;
	private int numOfAdults;
	private int numOfChildren;
	private double totalServiceFee;

	protected String cruiseSevice() {
		cruiseYesOrNoInput = needCruiseService(cruiseName, cruiseService, candleLightDinnerFee, cruiseDaysOfStay,
				cruisePriceForAdults, cruisePriceForchildren);
		if (cruiseYesOrNoInput.equalsIgnoreCase("Y")) {
			priceCalculation();
		}
		return cruiseYesOrNoInput;
	}

	private void priceCalculation() {
		numOfAdults = numofAdults(cruiseName);
		numOfChildren = numofChildren(cruiseName);
		totalServiceFee = cruiseServicesFee(cruiseYesOrNoInput, candleLightDinnerFee);
		preBookDinnerBuffet();
		finalPriceCalculation(cruiseName, cruiseService, noOfAdults, noOfChildren, cruiseDaysOfStay, cruisePriceForAdults,
				cruisePriceForchildren, totalServiceFee);
	}
}