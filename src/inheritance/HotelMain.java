package inheritance;


public class HotelMain extends UserClass {

	private String suiteSelection = "";
	private int hotelNumOfStays;
	private int ratePerNight;
	private String freeBreakfast;
	private int adultAdditionalPriceMeal = 25;
	private int childAdditionalPriceMeal = 5;
	boolean yesOrNofreeBreakfast = false;

	
	protected void needFreeBreakfast() {
		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.(yes/no)");
		freeBreakfast = scn.next();
		if (freeBreakfast.equalsIgnoreCase("yes")) {
			yesOrNofreeBreakfast = true;
		}
	}

	private int priceFreeBreakfast() {
		if (yesOrNofreeBreakfast) {
			System.out.println("Lunch Pre-Booked Special Rate Adults @" + noOfAdults + " :  "
					+ (adultAdditionalPriceMeal * noOfAdults) + "$");
			System.out.println("Lunch Pre-Booked Special Rate Children @" + noOfChildren + " :  "
					+ (childAdditionalPriceMeal * noOfChildren) + "$");
			return ((adultAdditionalPriceMeal * noOfAdults) + (childAdditionalPriceMeal * noOfChildren));
		} else {
			return 0;
		}
	}

	protected int noOfDaysOfStay() {
		System.out.println("Enter the number of days of stay :");
		hotelNumOfStays = scn.nextInt();
		return hotelNumOfStays;
	}

	private void additionalMeal() {
		System.out.println("Lunch Pre-Booked Special Rate Adults	@" + noOfAdults * adultAdditionalPriceMeal);
		System.out.println("Lunch Pre-Booked Special Rate Children @" + noOfChildren * childAdditionalPriceMeal);
	}

	protected void finalPriceCalculation(String suiteSelection, int hotelNumOfStays, int ratePerNight) {
		System.out.println("The total amount you will be charged is:");
		System.out.println(
				suiteSelection + " @ " + hotelNumOfStays + " nights :" + (hotelNumOfStays * ratePerNight) + "$");
		int totalPriceFreeBreakfast = priceFreeBreakfast();
		System.out.println(
				"Total Price :" + (formatter.format(totalPriceFreeBreakfast + (hotelNumOfStays * ratePerNight))) + "$");
		System.out.println("HST	@ 18%   :"
				+ (formatter.format(totalPriceFreeBreakfast + (hotelNumOfStays * ratePerNight) * .18)) + "$");
		System.out.println("Final Price	:"
				+ (formatter.format(totalPriceFreeBreakfast + (hotelNumOfStays * ratePerNight) * 1.18)) + "$");
	}
}
