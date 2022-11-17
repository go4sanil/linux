package inheritance;

public class HotelDeluxSuite extends HotelMain {

	private int ratePerNight = 180;
	private String suiteSelection = "Delux_Suite";
	
	public void hotelSuite() {
		numofAdults(suiteSelection);
		numofChildren(suiteSelection);
		needFreeBreakfast();
		int hotelNumOfStays = noOfDaysOfStay();
		finalPriceCalculation(suiteSelection, hotelNumOfStays, ratePerNight);
	}
}
