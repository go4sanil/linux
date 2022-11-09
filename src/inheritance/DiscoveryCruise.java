package inheritance;

public class DiscoveryCruise extends CruiseMain {
	String cruiseName = "Discovery_Cruise";
	String cruiseService = "Adventure_Games";
	int adventureGameFee = 50;
	private double cruisePriceForAdults = 39.99;
	private double cruisePriceForchildren = 9.99;
	int cruiseDaysOfStay = 4;
 

	public String adventureGameFee() {
		System.out.println(
				cruiseName+ " is offering" + cruiseService + "at " + adventureGameFee +"$ per person. Would you like to play some ? (yes/no)");
		String isPlayingAdventureGames = scn.next();

		if (isPlayingAdventureGames.equalsIgnoreCase("Yes")) {
			System.out.println("The cruise that you have selected is " + this.cruiseName + " which is a "
					+ this.cruiseDaysOfStay + " day cruise" + " with" +cruiseService + "(" + adventureGameFee
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
		double totalServiceFee = cruiseServices(cruiseName,cruiseYesOrNoInput,adventureGameFee); 
		System.out.println("Your Package includes:");
		System.out.println(this.cruiseName + "	Adults @ " + super.noOfAdults + ":  "+(this.cruiseDaysOfStay*this.cruisePriceForAdults*noOfAdults)+"$");
		System.out.println(this.cruiseName + "	Children @ " + super.noOfChildren + ":  "+(this.cruiseDaysOfStay*this.cruisePriceForchildren*noOfChildren)+"$");
		if(totalServiceFee>0)
		{
			System.out.println(this.cruiseName + " " +this.cruiseService + " for Family@ " + (super.noOfAdults+super.noOfChildren) + "person :  "+totalServiceFee+"$");	
		}
		double totalBuffetPrice=priceCalcDinnerBuffet();
		double totalPrice = totalBuffetPrice +(this.cruiseDaysOfStay*((this.cruisePriceForAdults*noOfAdults)) + (this.cruisePriceForchildren*noOfChildren));
		System.out.println("Total Price  :  " +totalPrice +"$");
		System.out.println("HST	@ 18%    :  " +(totalPrice*.18) +"$");
		System.out.println("Final Price	 :  " +(totalPrice*1.18) +"$" );
	}




}
