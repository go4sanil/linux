package inheritance;

public class MysteryCruise extends CruiseMain {
	
	String cruiseName = "Mystery_Cruise";
	String cruiseService = "Casino_Service";
	int casinoEntryFee = 20;
	private double cruisePriceForAdults = 45.99;
	private double cruisePriceForchildren = 12.99;
	int noOfDaysOnCruise = 2;

	public String casinoEntry() {
		System.out.println(
				cruiseName + " is offering" + cruiseService + "for adults at" + cruiseService +"$ per person. Would you like to go for this option ? (yes/no)");
		String isOptingCasinoService = scn.next();

		if (isOptingCasinoService.equalsIgnoreCase("Yes")) {
			System.out.println("The cruise that you have selected is " + this.cruiseName + " which is a "
					+ this.cruiseDaysOfStay + " day cruise" + " with" +cruiseService + "(" + casinoEntryFee
					+ "$)fee per person\r\n" + "Price for Adults(greater than 12): " + this.cruisePriceForAdults
					+ " per day\r\n" + "Price for kids above 5: " + cruisePriceForchildren + " per day\r\n"
					+ "Please press 'Y' if you want to continue with the selection or press any other key to select another.");
			cruiseYesOrNoInput = scn.next();
			return cruiseYesOrNoInput;
		}

		else {
			System.out.println("The cruise that you have selected is " + this.cruiseName + " which is a "
					+ this.cruiseDaysOfStay + " day cruise\r\n" + "Price for Adults(greater than 12): "
					+ this.cruisePriceForAdults + " per day\r\n" + "Price for kids above 5: " + cruisePriceForchildren
					+ " per day\r\n"
					+ "Please press 'Y' if you want to continue with the selection or press any other key to select another.");
			cruiseYesOrNoInput = scn.next();
			return cruiseYesOrNoInput;
		}
		
		}
	
public void finalPrice() {
	

		preBookDinnerBuffet();
		double totalServiceFee = cruiseServices(cruiseName,cruiseYesOrNoInput,casinoEntryFee); 
		
		System.out.println("Your Package includes:");
		System.out.println(this.cruiseName +" "+ "Adults	@ " + super.noOfAdults + ":  "+(this.noOfDaysOnCruise*this.cruisePriceForAdults*noOfAdults)+"$");
		System.out.println(this.cruiseName +" "+ "Children	@ " + super.noOfChildren + ":  "+(this.noOfDaysOnCruise*this.cruisePriceForchildren*noOfChildren)+"$");
		double totalBuffetPrice=priceCalcDinnerBuffet();
		if(totalServiceFee>0)
		{
			System.out.println(this.cruiseName + " " +this.cruiseService + " for Adults@ " + (super.noOfAdults) + " :  "+totalServiceFee+"$");	
		}
		double totalPrice = totalBuffetPrice +(this.cruiseDaysOfStay*((this.cruisePriceForAdults*noOfAdults)) + (this.cruisePriceForchildren*noOfChildren));
		System.out.println("Total Price  :  " +totalPrice +"$");
		System.out.println("HST	@ 18%    :  " +(totalPrice*.18) +"$");
		System.out.println("Final Price	 :  " +(totalPrice*1.18) +"$" );
	}

}
