package inheritance;

public class HotelFamilySuite extends HotelMain {

	private int ratePerNight = 230;
	String suiteSelection = "Family_Suite";

	protected void hotelSuite() {
		numofAdults(suiteSelection);
		numofChildren(suiteSelection);
		needFreeBreakfast();
		int hotelNumOfStays = noOfDaysOfStay();
		finalPriceCalculation(suiteSelection, hotelNumOfStays, ratePerNight);
	}
}
