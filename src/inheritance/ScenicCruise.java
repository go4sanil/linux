package inheritance;

public class ScenicCruise extends CruiseMain  {
	
	String cruiseName = "Scenic_Cruise";
	String cruiseService = "Spa_Service";
	int spaCharge = 50;
	private double cruisePriceForAdults = 43.99;
	private double cruisePriceForchildren = 12.99;
	int cruiseDaysOfStay = 3;
	

	public String spaSevice() {
		System.out.println(
				cruiseName + " is offering for adults " +cruiseService + " " + spaCharge+ "$ per person. Would you like to go for this option ? (yes/no)");
		String isOptingSpaService = scn.next();

		if (isOptingSpaService.equalsIgnoreCase("Yes")) {
			System.out.println("The cruise that you have selected is " + this.cruiseName + " which is a "
					+ this.cruiseDaysOfStay + " day cruise" + " with " + this.cruiseService + " (" + spaCharge
					+ "$) fee per person\r\n" + "Price for Adults(greater than 12): " + this.cruisePriceForAdults
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
		double totalServiceFee = cruiseServices(cruiseName,cruiseYesOrNoInput,spaCharge); 
		
		System.out.println("Your Package includes:");
		System.out.println(this.cruiseName +" " +"Adults	@" + super.noOfAdults + ":  "+(this.cruiseDaysOfStay*this.cruisePriceForAdults*super.noOfAdults)+"$");
		System.out.println(this.cruiseName +" " +"Children	@" + super.noOfChildren + ":  "+(this.cruiseDaysOfStay*this.cruisePriceForchildren*super.noOfChildren)+"$");
		double totalBuffetPrice=priceCalcDinnerBuffet();
		if(totalServiceFee>0)
		{
			System.out.println(this.cruiseName + " " +this.cruiseService + " for Adults@" + (super.noOfAdults) + " :  "+totalServiceFee+"$");	
		}
		double totalPrice = totalServiceFee + totalBuffetPrice +(this.cruiseDaysOfStay*((this.cruisePriceForAdults*noOfAdults)) + (this.cruisePriceForchildren*noOfChildren));
		System.out.println("Total Price  :  " +totalPrice +"$");
		System.out.println("HST	@ 18%    :  " +(totalPrice*.18) +"$");
		System.out.println("Final Price	 :  " +(totalPrice*1.18) +"$" );
	}

}
