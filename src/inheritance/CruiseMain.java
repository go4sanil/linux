package inheritance;

public class CruiseMain extends UserClass {
	
	String cruiseNameUserInput;
	int cruiseDaysOfStay;
	int cruisePriceForAdults;
	int cruisePriceForchildren;
	String cruiseYesOrNoInput;
	String yesNoDinnerBuffet;
	Boolean needDinnerBuffet=false;
	double adultAdditionalPriceMeal = 20.99;
	double childAdditionalPriceMeal = 4.99;
	double totalPriceServicesFee;
	
	public String cruiseClass() {
	
	System.out.println(
			"We offer 4 different packages as displayed below. Please enter the cruise that you want to select:\r\n"
					+ "Scenic_Cruise\r\n" + "Sunset_Cruise\r\n" + "Discovery_Cruise\r\n"
					+ "Mystery_Cruise\r\n");
	String cruiseNameUserInput = scn.next();
	
	return cruiseNameUserInput;
	
		
	}
	
	public void preBookDinnerBuffet() {

		System.out.println(
				"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child.");
		yesNoDinnerBuffet = scn.next();
		
		if(yesNoDinnerBuffet.equalsIgnoreCase("Yes"))
		{needDinnerBuffet = true;}
					
	
	}
	
	public double priceCalcDinnerBuffet() {
		
		if(needDinnerBuffet) {
			if(noOfAdults>0)
		{System.out.println("Lunch Pre-Booked Special Rate Adults @" +noOfAdults	+" :  " +(adultAdditionalPriceMeal*noOfAdults) +"$"  );}
			if(noOfChildren>0)
		{System.out.println("Lunch Pre-Booked Special Rate Children @" +noOfChildren +" :  "	+(childAdditionalPriceMeal*noOfChildren)+"$" );}
		return ((adultAdditionalPriceMeal*noOfAdults)+(childAdditionalPriceMeal*noOfChildren));}
		else
		{return 0;}
	}
	
	public double cruiseServices(String cruiseName,String cruiseYesOrNoInput,double servicesFee) {
		if(cruiseYesOrNoInput.equalsIgnoreCase("Y"))
		{ 
			switch (cruiseName) {
			  case "Scenic_Cruise":
				  totalPriceServicesFee = servicesFee*noOfAdults ;
			    break;
			  case "Sunset_Cruise":
				  totalPriceServicesFee = (servicesFee*noOfAdults) ;
			    break;
			  case "Discovery_Cruise":
				  totalPriceServicesFee = ((servicesFee*noOfAdults)+(servicesFee*noOfChildren));
			    break;
			  case "Mystery_Cruise":
				  totalPriceServicesFee = servicesFee*noOfAdults ;
			    break;
			 
			    
			}
			
		}
		
		
		return totalPriceServicesFee;
		
	}
	
	
	}

	
	
	
	
