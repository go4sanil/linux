package inheritance;

import java.util.Scanner;

public class HotelMain extends UserClass{

	Scanner scn = new Scanner(System.in);
	String suiteSelection="";
	int hotelNumOfStays;
	int ratePerNight;
	String freeBreakfast;
	private int adultAdditionalPriceMeal = 25;
	private int childAdditionalPriceMeal = 5;
	boolean adultErrorMessage = false;
	boolean childErrorMessage = false;
	boolean yesOrNofreeBreakfast = false;

	public String hotelroomSelection() {

		do {
			System.out.println("Please enter the room you want to select" + "\n"
					+ "Delux_Suite: accommodates 2 adults and 2 children at the rate of $180/ night" + "\n"
					+ "Family_Suite: accommodates 4 adults and 4 children at $230/ night.");

			suiteSelection = scn.next();
		
			if (suiteSelection.equalsIgnoreCase("Delux_Suite")) {
				return "Delux_Suite";
			} else if (suiteSelection.equalsIgnoreCase("Family_Suite")) {
				return "Family_Suite";
			} else {
				System.out.println("Invalid Entry: Please try again :");
				
			}

		}

		while (!(suiteSelection.equalsIgnoreCase("Delux_Suite")) || !(suiteSelection.equalsIgnoreCase("Family_Suite")));
		return "false";
	}



	public void needFreeBreakfast() {

		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.(yes/no)");
		freeBreakfast = scn.next();
		
		if(freeBreakfast.equalsIgnoreCase("yes"))
		{yesOrNofreeBreakfast = true;}
	
	}
	
	public int priceFreeBreakfast() {
		
		if(yesOrNofreeBreakfast) {
		System.out.println("Lunch Pre-Booked Special Rate Adults @" +noOfAdults	+" :  " +(adultAdditionalPriceMeal*noOfAdults) +"$"  );
		System.out.println("Lunch Pre-Booked Special Rate Children @" +noOfChildren +" :  "	+(childAdditionalPriceMeal*noOfChildren)+"$" );
		return ((adultAdditionalPriceMeal*noOfAdults)+(childAdditionalPriceMeal*noOfChildren));}
		else
		{return 0;}
	}

	public int noOfDaysOfStay() {

		System.out.println("Enter the number of days of stay :");
		hotelNumOfStays = scn.nextInt();
		return hotelNumOfStays;
	}

	public void additionalMeal() {
		System.out.println("Lunch Pre-Booked Special Rate Adults	@" + noOfAdults * adultAdditionalPriceMeal);
		System.out.println("Lunch Pre-Booked Special Rate Children @" + noOfChildren * childAdditionalPriceMeal);
	}


}
